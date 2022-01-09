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



  Scenario: Questionary 1 - guida esperta
    And User click "Maggiore di 26 anni" button
    And User click "Avanti" button
    And User set birthDate to 1972-07-31
    And User click OwnerAge checkbox
    And User click "Avanti" button
    And Wait more seconds
    And User click "Unica soluzione" button
    And User click "Solo RC AUTO" button
    And User click "Avanti" button
    And User click "Avanti" button
    And Wait more seconds
    And User click "Avanti" button
    Then page should contain Questionario richieste ed esigenze del contraente
    And page should contain Le persone nella tua famiglia che potrebbero utilizzare l’auto hanno tutte almeno 26 anni compiuti?

  Scenario: Questionary 1 - guida libera
    And User click "Minore di 26 anni" button
    And User click "Avanti" button
    And User set birthDate to 1972-07-31
    And User click OwnerAge checkbox
    And User click "Avanti" button
    And Wait more seconds
    And User click "Unica soluzione" button
    And User click "Solo RC AUTO" button
    And User click "Avanti" button
    And User click "Avanti" button
    And Wait more seconds
    And User click "Avanti" button
    Then page should contain Questionario richieste ed esigenze del contraente
    And page should contain Ci sono persone nella tua famiglia di età inferiore ai 26 anni che potrebbero usare anche occasionalmente l’auto?
