@tera76 @mga

Feature: tera76 rca fastquote page


  Background: login
    Given A user navigates rca home page
    And User click "Accedi" button
    And Wait few seconds
    And Set username TestRca163
    And Set password TestRca163
    When User click "Accedi" button
    When User click "Ok, accetto" button


  Scenario: Unica soluzione, solo RC
    Given User click "EZ299EK" button
    And User click "Calcola un preventivo" button
    And User click "Maggiore di 26 anni" button
    And User click "Avanti" button
    And User set birthDate to 1972-07-31
    And User click OwnerAge checkbox
    And User click "Avanti" button
    And Wait more seconds
    When User click "Unica soluzione" button
    And User click "Solo RC AUTO" button
    And User click "Avanti" button
    Then page should contain Quali sono le garanzie di cui hai bisogno?
