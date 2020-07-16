Feature: Automating resume builder application


  Background: user will login by valid creds
    Given user is on resume builder loginpage
    When user choose login with gmail
    And enter successive domain My id
    And enter password of domain id


  Scenario: User will create a resume by entering data in all the fields and Verify user land on dashboard screen with edit download and view button
    When  User is on create resume page
    When  user enetr all the field's data in form
    And   user will enter first project sections details
    And   click on submit button
   Then  user will land on dashboard and create resume will be shown in first row
    And   user verify the edit view and download buttons
    And   click on logut button

  Scenario: Verify that user is not able to submit form without atleast one project
    When  User is on create resume page
    And   user will enter first half details
    And   click on remove button to remove project details part
    Then   click on  the submit button
    And    Verify the error message
    And   click on logut button


  Scenario: User should be able to add project by clicking on add project button
    When  User is on create resume page
    And   user will enter first half details
    And   click on remove button to remove project details part
    Then   click on  the submit button
    And    Verify the error message
    And    user click on add project button
    Then   verify project section has been added by verifying fields
    And   click on logut button



  Scenario: Verify user is able to logout from dashboard page
    Given   user is on dashboard screen and click logout


  Scenario: Verified that user is able to logout from resume creation screen
    And   user is already on create resume screen and user click on profile icon
    And   click on logut button


  Scenario: User will click on edit button and then user will redirect to edit page where user will verify all button like submit,submit and view,remove,add new button
    And    user click on edit button
    And    user will redirect to another page where user will verify Submit and submit and view button
    And    user will verify remove and add new button
    And   click on logut button

 Scenario: When user click on "Submit and view"" button of user will redirect to another page and verify the download the resume and edit resume  button

  And    user click on edit button
  And    user will redirect to another page and user click on submit and view button
  Then   user will be redirected to new page where user will verify download the resume and edit resume button
  And   click on logut button

  Scenario: Verify user should not be able to submit the form without filling all the mendatory fields
    When  User is on create resume page
    And  user will click on submit button without filling fields
    Then   user will verify the error of each mendatory field
    And     click on logut button


  Scenario: Search the user through name , title and technology
    Given Enter any resource "anand" and verify Resume By title
    Then User should be able to download the Resume
    Then Verify the view feature
    Then verify search bar of "anand" and "Lead Engineer expertise in web development" and "C "
    Then verify creation and modification date
    Given Click on the edit icon and Edit "NewName" and then submit
