Feature: To verify the functionality of Get results now button on Healthcaresuccess url landing page

  @browser1
  Scenario: Verify after selecting "get results now" button if Goals are not selected then system should show error when user selects and unselects checkbox and then clicks on continue
    Given I am on Login page
    And I perform click on GET RESULTS NOW
    And I select dropdown value Hospital/Health System
    And I type Test1234 in company name field
    And I perform click on Continue
    And I perform click on Attract more patients from the Internet
    And I perform click on Attract more patients from the Internet
    Then I see Please select at least one option. is displayed

  @browser1
  Scenario: Verify E2E flow for "Get results now" button until Step 2 (Do not submit the form)
    Given I am on Login page
    And I perform click on GET RESULTS NOW
    And I perform click on Attract more patients from the Internet
    And I select dropdown value Hospital/Health System
    And I type Test1234 in company name field
    And I perform click on Continue
    Then I see Monthly Marketing Budget is displayed
    And I enter 2 in marketing_budget field
    And I select dropdown value 1 to 9
    And I enter 3 in number_of_locations field
    And I enter Test67890 in anything_else_you_d_like_us_to_know_ field
    And I perform click on Last Step