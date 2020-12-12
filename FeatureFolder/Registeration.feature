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
    #And User verify the email as <Email>
    And user compose message to send email
    And user verify mail sent message as "he message has been sent to"

    Examples: 
      | FirstName | LastName | Email           | UserName  | Password     | CofirmPassword |
      # | john1   | Jha1    | aj3@gmail.com | john3    | password@3 | password@3   |
      #| john2   | Jha2     | aj4@gmail.com | john4 | password@4 | password@4   |
      #| john3   | Jha3     | aj5@gmail.com | john5| password@5 | password@5   |
      | john21   | Jha21    | john21@gmail.com | john21 | password@21| password@21   |

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
     # | john1   | Jha1    | aj32@gmail.com | aj3    | pass3@567 | pass3@567    |
       | john21   | Jha21    | john21@gmail.com | john21 | password@21| password@21   |
