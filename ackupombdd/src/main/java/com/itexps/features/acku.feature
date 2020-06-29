#----------------------------------
# ACKHU Cucumber feature file
#----------------------------------
  
Feature: Inchins Web Application Test
Scenario: Validate Inchins Home Page Test

    Given user opens browser
    Then user is on login page
    Then user enters emailid password and submit button
    Then user selects location and mainmenu
    Then products page is displayed

   
