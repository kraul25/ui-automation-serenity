package com.testing.automation.utils;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.given;

public class Service {
    public static String get2FACode(String userId) throws Exception {
        RequestSpecification requestSpec = getRequestSpecification(userId);
        ResponseSpecification responseSpec = getResponseSpecification();

        return getOTP(requestSpec, responseSpec);
    }

    private static String getOTP(RequestSpecification requestSpec, ResponseSpecification responseSpec) {
        Response response =
                given().log().uri().
                        spec(requestSpec).
                        when().
                        get("/genuser").
                        then().
                        spec(responseSpec).
                        extract().response();
        String responseInString
                = response.asString();
        JsonPath js = new JsonPath(responseInString);
        return js.get("Value");
    }

    private static ResponseSpecification getResponseSpecification() {
        ResponseSpecBuilder responseBuilder = new ResponseSpecBuilder();
        responseBuilder.expectStatusCode(200);
        return responseBuilder.build();
    }

    private static RequestSpecification getRequestSpecification(String userId) {
        RequestSpecBuilder requestBuilder = new RequestSpecBuilder();
        requestBuilder.setBaseUri("");
        requestBuilder.setBasePath("");
        requestBuilder.addQueryParam("username", userId);
        return requestBuilder.build();
    }
}
