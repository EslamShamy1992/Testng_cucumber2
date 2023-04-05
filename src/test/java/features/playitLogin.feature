
Feature: Test the login functionality
  @Sanity @Regression
  Scenario: login with a valid email and password
    Given user open the website and go to playit login page
    When user fill the email as "rabeea.marzouk@ibnsina-pharma.com" and "asd@1234" and clicks on login button
    Then user will be redirected to home page