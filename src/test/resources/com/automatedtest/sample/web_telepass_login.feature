@tera76

Feature: tera76 tera76 login page



  Scenario: Go to tera76 login page prod
    And A user navigates to tera76 login page
    And Set username ciccio
    And Set password pasticcio
    And Click access button
    And page should contain Credenziali non corrette

