Feature: Tagexpo Website Testing
         As a user i want to know the sign in feature results,
         when i am entering both valid and invalid credentials.
         
Scenario Outline: TagExpo Signin Module testing
    Given the user enters website and clicks signin button
    When user enters the username "<username>" and password "<password>"
    Then users sees the result depends on the credential

    Examples: 
      | username|password|
      | sachinanand584@gmail.com|Sachin1@| 
      |  |  |
      |sachin@gmail.com|Sachin1@|
      |sachinanand584@gmail.com|12345|
