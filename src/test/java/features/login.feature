

  Feature: Test the login functionality
    @Sanity @Regression
    Scenario: login with a valid email and password
      Given user open the website and go to login page
      When user fill the email as "rabeea.marzouk@ibnsina-pharma.com" and "asd@1234" and clicks on login button
      Then user will be redirected to home page

      @Regression
      Scenario Outline: login with invalid credentials
        Given user open the website and go to login page
        When user fill the email as "<username>" and "<password>" and clicks on login button
        Then error message should appears

        Examples:
         |                  username                             |         password         |
         |     rabeea.marzouk@ibnsina-pharma.com                 |         asd@1234         |
         |     rabeea.marzouk@ibnsina-pharma.com                 |         asd@12345        |
         |     rabeea.marzouk@ibnsina-phrma.com                  |         asd@1234         |
         |     eseea.marzouk@ibnsinla-pharma.com                |         asd@12234        |