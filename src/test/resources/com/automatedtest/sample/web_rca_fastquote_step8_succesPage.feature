@tera76 @mga

Feature: tera76 rca fastquote page


  Background: login
    Given A user navigates rca home page
    And User click "Accedi" button
    And Wait few seconds
    And Set username TestRca163
    And Set password TestRca163
    And User click "Accedi" button
    And User click "Ok, accetto" button
    And User click "EZ299EK" button
    And User click "Calcola un preventivo" button
    And User click "Maggiore di 26 anni" button
    And User click "Avanti" button
    And User set birthDate to 31/07/1972
    And User click OwnerAge checkbox
    And User click "Avanti" button
    And Wait more seconds
    And User click "Unica soluzione" button
    And User click "Solo RC AUTO" button
    And User click "Avanti" button
    And User click "Avanti" button
    And Wait more seconds
    And User click "Avanti" button
    And User set Questionary checkbox to true
    And User click "Avanti" button

  Scenario: Confirm Dialog - Cancel
    When User set TermsAndCond checkbox to true
    And User click "Avanti" button
    Then page should contain Conferma per procedere con l’acquisto
    And page should contain Totale addebito
    When User click "Annulla" button
    Then page should not contain Conferma per procedere con l’acquisto
    And page should contain Termini e condizioni
