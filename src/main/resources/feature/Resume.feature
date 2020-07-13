Feature: Automating resume builder application


# Scenario: user will login by valid creds
#  Given user is on resume builder loginpage
#    When user choose login with gmail
#    And enter successive domain "Shiwani.sharma@successive.tech"id
#    And  user will enter password

#
#    Given user is on resume builder loginpage
#    When user choose login with gmail
#    And  enter successive domain "Shiwani.sharma@successive.tech"id
#    And  user will enter password

  Background:
    Given user is on resume builder loginpage
    When user choose login with gmail
    And  enter successive domain "Shiwani.sharma@successive.tech"id
    And  user will enter password
    When  User is on create resume page


  Scenario Outline: Verify that user is not able to submit form with invalid phone no.

    And  user enter all the field's data in form excluding phone
    And   user will enter first project sections details
    And   user enter "<phone_no>" in the field
    And  user click on submit button
    Then user wont be able to submit the form and verify client side validation
    And   click on logut button
    Examples:

      | phone_no     |
      | 00           |
      | 123456       |
      | dwjwdjp      |
      | @#$%^&**&*&* |





#  Scenario Outline: User will login to the application with invalid creds
#    Given user is on resume builder loginpage
#    When user choose login with gmail
#   And enter successive domain "<Email>"id
#    Examples:
#      | Email         |
#      | Shiwani@123   |
#      | Vaishali@123  |
#      | wedwwejpo.com |


#
#  Scenario: User will create a resume by entering data in all the fields and Verify user land on dashboard screen with edit download and view button
#    Given user will click on create resume button
#    When  user enetr all the field's data in form
#    And   user will enter first project sections details
#    And   click on submit button
#    Then  user will land on dashboard and create resume will be shown in first row
#    And   user verify the edit view and download buttons



#    Scenario: Verify that user is not able to submit form without atleast one project
#      Given User is on create resume page
#      And   user will enter first half details
#      And   click on remove button to remove project details part
#      Then   click on  the submit button
#      And    Verify the error message
#
#    Scenario: User should be able to add project by clicking on add project button
#      Given User is on create resume page
#      And   user will enter first half details
#      And   click on remove button to remove project details part
#      Then   click on  the submit button
#      And    Verify the error message
#      And    user click on add project button
#      Then   verify project section has been added by verifying fields
#
#  Scenario: Verify user is able to logout from dashboard page
#    Given   user is on dashboard screen and click logout


#      Scenario: Verified that user is able to logout from resume creation screen
#        And   user is already on create resume screen and user click on profile icon
#       And   click on logut button


#  Scenario: User will click on edit button and then user will redirect to edit page where user will verify all button like submit,submit and view,remove,add new button
#    Given  User is on create resume page
#    And    user click on edit button
#    And    user will redirect to another page where user will verify Submit and submit and view button
#    And    user will verify remove and add new button
#
#
#  Scenario: When user click on "Submit and view"" button of user will redirect to another page and verify the download the resume and edit resume  button
#    Given  User is on create resume page
#    And    user click on edit button
#    And    user will redirect to another page and user click on submit and view button
#    Then   user will be redirected to new page where user will verify download the resume and edit resume button


