Feature: Validate the User Registeration

  @SuccsessRegistration
  Scenario Outline: Registration Scenario
    Given User Launch the myOrganization web application
    When User click on SignUp Link for Registration
    Then User Verify the Registration Page
    When user enters the <FirstName> and <LastName>
    And user entering the <Email> and <UserName>
    And user will enter the <Password> and <CofirmPassword>
    And user click on Register button
    And User verify the success message
    And User verify the success message with
      """
      Dear <FirstName> <LastName>,
      
      Your personal settings have been registered.
      """
    And User click on homePage dropdown
    And User verify the email as <Email>
    And user compose message to send email
    And user verify mail sent message as "he message has been sent to"

    Examples: 
      | FirstName | LastName | Email            | UserName | Password    | CofirmPassword |
      | john38 | Jha38  | aj35@gmail.com   | john38 | password@15 | password@15    |
  #    | john44    | Jha44    | john34@gmail.com | john44   | password@26 | password@26    |

  @existinguserRegisteration
  Scenario Outline: Registration Scenario with Existing User
    Given User Launch the myOrganization web application
    When User click on SignUp Link for Registration
    Then User Verify the Registration Page
    When user enters the <FirstName> and <LastName>
    And user entering the <Email> and <UserName>
    And user will enter the <Password> and <CofirmPassword>
    And user click on Register button
    And User verify the warning message as "This login is already in use"

    Examples: 
      | FirstName | LastName | Email            | UserName | Password    | CofirmPassword |
      | john12    | Jha12    | aj12@gmail.com   | john12   | password@12 | password@12    |
      | john26    | Jha26    | john26@gmail.com | john26   | password@26 | password@26    |

  @LoginCheck
  Scenario Outline: Check user login ability
    Given User Launch the myOrganization web application
    When User enters <UserName> and <Password>
    And User clicks on Login button
    And User click on homePage dropdown
    And User verify the email as <Email>
    And user compose message to send email
    And user verify mail sent message as "he message has been sent to"

    Examples: 
      | Email            | UserName | Password    |
      | aj12@gmail.com   | john12   | password@12 |
      | john26@gmail.com | john26   | password@26 |
