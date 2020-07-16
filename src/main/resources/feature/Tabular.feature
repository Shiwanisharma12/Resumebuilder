Feature: Automate tabular form scenarios

  Background: user will login
    Given user is on resume builder loginpage
    When user choose login with gmail


  Scenario Outline: Verify that user is not able to submit form with invalid phone no.

    When enter successive domain My id
    And enter password of domain id
    When  User is on create resume page
    And   user enter "<phone_no>" in the field
    And  user click on submit button
    Then user wont be able to submit the form and verify client side validation
    And   click on logut button
    Examples:
      | phone_no     |
      | 00           |
      | 123456       |
      | +++++++      |
      | eeeeeeeeeeee |

   Scenario Outline: User will login to the application with invalid creds
     When  enter successive domain "<Email>"id in email field

     Examples:
       |Email          |
       | Shiwani@123   |
       | Vaishali@123  |
       | wedwwejpo.com |



  Scenario Outline: If user enters Invalid links in all the link fields  wich does not follow the standards ,client side error will be shown to user.(protocol+ domain)

    When enter successive domain My id
    And enter password of domain id
    When  User is on create resume page
    When user will fill the form with "<Invalid links>" And  Verify the client side error of link fields
    And   click on logut button

    Examples:
      | Invalid links                  |
      | Shiwani.sharma@successive.tech |
      | https://KEODJEOEODJDJ          |
      | 12345.com                      |
      | Shivani5111998@gmail.com       |
      | www.https://4rj4orj.com        |

