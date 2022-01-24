@Facebook
Feature: Login FB
  I want to check login
  
  Background: 
  Given Go to the Fb login page
  

  @Login
  Scenario Outline: Test Login
     When I enter username as <uname>
    And I enter password as <pass>
    Then Goin should be failed

    Examples: 
      | uname      | pass     | status  |
      | tom        | jerry    | Fail    |
     | 7028414841 | rohan135 | Success |
 
 @Uname
  Scenario Outline: Test USername Field
     When I enter username as rohanm
    Then check the username as same as Entered

   
