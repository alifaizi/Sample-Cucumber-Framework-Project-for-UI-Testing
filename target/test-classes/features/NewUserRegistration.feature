Feature: New User Registeration
#This is just to create new account to be used to run in each time we run the Capstone project
  @RegisteringNewAccount
  Scenario: Register with Tekschool Test Environment Website
    Given I am on Test Environment Home Page
    When I click on My Account button
    And I click on register link
    And I fill the registration form
      | firstname | lastname | email              | telephone  | password | confirmPassword |
      | Ali      | Faizi    | eng.alifaizi@tekschool.com | 9876543210 | xyz2022   | xyz2022          |
    And I subscribe to newsletter
    And I agree to privacy policy
    And I click on continue button
    Then I validate my account is created successfully
