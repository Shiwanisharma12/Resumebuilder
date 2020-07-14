Feature: Automate tabular form scenarios

Scenario Outline: Verify that user is not able to submit form with invalid phone no.
Given user is on resume builder loginpage
When user choose login with gmail
And enter successive domain "Shiwani.sharma@successive.tech"id
And  user will enter password
When  User is on create resume page
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


Scenario Outline: User will login to the application with invalid creds
Given user is on resume builder loginpage
When user choose login with gmail
And enter successive domain "<Email>"id
Examples:

| Email         |
| Shiwani@123   |
| Vaishali@123  |
| wedwwejpo.com |
