@tera76 @mga

Feature: tera76 tera76 login page


  Scenario: Go to rca login page dev, check home page copies
    Given A user navigates rca home page
    And User click "Accedi" button
    And Wait more seconds
    And Set username italia781
    And Set password italia781
    When User click "Accedi" button
    And Wait more seconds
    Then page should contain tera76 Assicura: un nuovo modo per assicurare la tua auto. Su misura per te.


