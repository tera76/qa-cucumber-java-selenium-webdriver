@tera76 @mga

Feature: tera76 rca fastquote page

  Background: login
    Given A user navigates rca home page
    And User click "Accedi" button
    And Wait few seconds
    And Set username tera76man4
    And Set password tera76man4
    When User click "Accedi" button
    When User click "Ok, accetto" button

  Scenario: check birth date
    Given User click "EZ299EK" button
    And User click "Calcola un preventivo" button
    And User click "Maggiore di 26 anni" button
    And User click "Avanti" button
    And User set birthDate to 1919-02-19
    And User click OwnerAge checkbox
    And User click "Avanti" button
    When Wait more seconds
    Then page should contain La data di nascita che hai inserito non corrisponde a quella associata
    When User click "RIPROVA" button
    And User set birthDate to 1972-07-31
    And User click OwnerAge checkbox
    And User click "Avanti" button
    When Wait more seconds
    Then page should contain Personalizza la tua polizza
