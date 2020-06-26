$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Feature/login.feature");
formatter.feature({
  "line": 1,
  "name": "Test the login functionality",
  "description": "",
  "id": "test-the-login-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Test Using Valid Credentials",
  "description": "",
  "id": "test-the-login-functionality;test-using-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I Open Chrome Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I go to the Salesforce application",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I maximize my window",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter \"batch03@codegator.us.qa\" username",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter \"Pa55word\" password",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click the \"Login\" button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I click \"Accounts\" tab",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I am on \"Accounts\" home page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I click the \"new\" button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I enter Account Name Field",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I click the save button",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I should see the Account record",
  "keyword": "Then "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "test-the-login-functionality;test-using-valid-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 19,
      "id": "test-the-login-functionality;test-using-valid-credentials;;1"
    },
    {
      "cells": [
        "batch03@codegator.us.qa",
        "Pa55word"
      ],
      "line": 20,
      "id": "test-the-login-functionality;test-using-valid-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 20,
  "name": "Test Using Valid Credentials",
  "description": "",
  "id": "test-the-login-functionality;test-using-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I Open Chrome Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I go to the Salesforce application",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I maximize my window",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter \"batch03@codegator.us.qa\" username",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter \"Pa55word\" password",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click the \"Login\" button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I click \"Accounts\" tab",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I am on \"Accounts\" home page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I click the \"new\" button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I enter Account Name Field",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I click the save button",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I should see the Account record",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTest.I_Open_Chrome_Browser()"
});
formatter.result({
  "duration": 6557522875,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.I_go_to_the_Salesforce_application()"
});
formatter.result({
  "duration": 2292409308,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.I_maximize_my_window()"
});
formatter.result({
  "duration": 427258493,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "batch03@codegator.us.qa",
      "offset": 9
    }
  ],
  "location": "LoginTest.I_enter_username(String)"
});
formatter.result({
  "duration": 1331332092,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pa55word",
      "offset": 9
    }
  ],
  "location": "LoginTest.I_enter_password(String)"
});
formatter.result({
  "duration": 324433516,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 13
    }
  ],
  "location": "AccountTest.I_click_the_button(String)"
});
formatter.result({
  "duration": 1266101226,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Accounts",
      "offset": 9
    }
  ],
  "location": "AccountTest.I_click_tab(String)"
});
formatter.result({
  "duration": 1870925649,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Accounts",
      "offset": 9
    }
  ],
  "location": "AccountTest.I_am_on_home_page(String)"
});
formatter.result({
  "duration": 357200609,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "new",
      "offset": 13
    }
  ],
  "location": "AccountTest.I_click_the_button(String)"
});
formatter.result({
  "duration": 265539370,
  "status": "passed"
});
formatter.match({
  "location": "AccountTest.I_enter_Account_Name_Field()"
});
formatter.result({
  "duration": 621834556,
  "status": "passed"
});
formatter.match({
  "location": "AccountTest.I_click_the_save_button()"
});
formatter.result({
  "duration": 1772096353,
  "status": "passed"
});
formatter.match({
  "location": "AccountTest.I_should_see_the_Account_record()"
});
formatter.result({
  "duration": 23472273,
  "status": "passed"
});
});