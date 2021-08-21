# Getting started with UI automation using Serenity Framework

#### Pre requisites
- JDK 1.8 and above  
- Serenity
- Cucumber  
- Appium (For app automation)  
- Maven

#### Understanding the framework
This framework is designed with following idea:
1) Make locators easy (Xpath,css etc are sometimes flaky because of absolute/relative values taken by auto testers. 
   With this framework there is no need to identify locators for most common ui elements like Button, Dropdown, Checkbox, Text displayed on screen)
2) Easy for manual testers to understand and use. Manual testers just need to write Gherkin and tests will get automatically automated for few of the steps.
3) Less coding knowledge required if used properly
4) Scenarios can be written by BA or Manual testers (Which should automatically automate most test cases)
5) Easy execution and reporting
6) Same framework can be used for APP automation(Hybrid apps along with Appium)
7) Framework can be used on any application or web url with minor tweaks

#### Locators
There are common methods created for Enter text, Click on button, verify Text displayed, select dropdown, select checkbox on screen currently.
When a different case arises then more common methods can be added.

Note: Sometimes it might not be possible to use common methods and will need seperate implementation.

If you go to common steps then you can see step definitions to do following:
1) Launch a browser
2) To enter any text in any field on the application under test
3) To perform click on any button in the app
4) To see if some text is displayed on screen
5) To select a dropdown value

Now with above 5 step definitions if you go to its implementation in base page then you will see that the xpath is formed during run time based on what is passed in the Gherkin.
and hence it eliminates a need to identify locators for each and every UI element. 
To form xpaths in certain places you will see that "name" or "value" html attribute is used and its quite possible that name/value is not present for some other application under test in its html.
If above is the case then framework needs to be modified a bit to identify html attribute which is in common for all fields. if this cant be done then there is a need to identify each locator seperately.

#### Execute tests using Maven
clean verify serenity:aggregate -Dproperties=test-properties/chrome.properties "-Dcucumber.options=--tags @browser1"

#### Page object model
Project structure is divided in features, Steps and pages
- Features will have all the feature files
- Steps will have step definitions
- Pages will have locators and methods to execute on the page

Since we have common steps to perform most of the common UI behaviours like clicking on button or reading text or sending text you will see very less implementation in GetResultsNow.java and GetResultsNowPage.java

#### Report
Report is created by serenity in target--> site --> serenity --> index.html
How and when screenshots will be taken is defined in property files.
