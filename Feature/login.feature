Feature: Test the login functionality

  
  Scenario Outline: Test Using Valid Credentials
    Given I Open Chrome Browser
    When I go to the Salesforce application
    And I maximize my window
    And I enter "batch03@codegator.us.qa" username
    And I enter "Pa55word" password
    When I click the "Login" button
     When I click "Accounts" tab
    Then I am on "Accounts" home page
    And I click the "new" button
    And I enter Account Name Field
    When I click the save button
    Then I should see the Account record

    Examples: 
      | username                | password |
      | batch03@codegator.us.qa | Pa55word |
