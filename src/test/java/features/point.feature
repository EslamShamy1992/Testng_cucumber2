Feature: point report
  Scenario: make sure that point report is exists
    Given user open the website and go to login page
    When user fill the email as "rabeea.marzouk@ibnsina-pharma.com" and "asd@1234" and clicks on login button
    And click on tms report and point
    Then point report is opened


    @Regression
    Scenario: make sure that expire report is exists
      Given user open the website and go to login page
      When user fill the email as "rabeea.marzouk@ibnsina-pharma.com" and "asd@1234" and clicks on login button
      And click on tms report and expire
      Then expire report is opend
