#----------------------------------
# ACKHU Cucumber feature file
#----------------------------------
  
Feature: Inchins Web Application Test
Scenario: Validate Inchins Home Page Test

    Given user opens browser
    When user is on login page
    Then user enters emailid password and submit button
    Then user selects location and mainmenu
    When products page is displayed
    Then user clicks noodles section and add hakka noodles to cart
    Then user clicks cart
    When cart page is displayed
    Then user clicks checkout
    Then user clicks pickup
    When checkout page is displayed
    Then user enters credit card and phone information to place order
    When verify order successful
    Then user logoff web application
    