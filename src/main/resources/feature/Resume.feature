Feature: Automating resume builder application

  Scenario Outline: User will login to the application
    Given user is on resume builder loginpage
    When user choose login with gmail
    And enter successive domain "<Email>"id
    And   user will enter password
#    Then  user will be logged in

    Examples:
     | Email                          |
#      | Shiwani@123                    |
#      | Vaishali@123                   |
#      | wedwwejpo.com                  |
      | Shiwani.sharma@successive.tech |


