Feature: 1clx Website Testing
  
Scenario Outline: Login Module Testig
    Given the User enter into login page
    When the user enters valid "<mail>" and "<password>"
    Then the user will get results depends on their credentials

    Examples: 
      | mail | password |
      | sachinanand584@gmail.com |    Sachin@1111 | 
      | name@gmail.com |  Sddd@3376     |
