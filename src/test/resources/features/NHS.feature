Feature: NHS
@smoke
Scenario: Eligibility Checker
Given I am a citizen of the UK "chrome"
When I put my circumstances into the Checker tool
Then I should get a result of whether I will get help or not

  Scenario: Eligibility Checker
    Given I am a citizen of the UK "firefox"
    When I put my circumstances into the Checker tool
    Then I should get a result of whether I will get help or not


