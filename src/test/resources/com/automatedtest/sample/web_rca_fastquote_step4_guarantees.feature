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
    And User set birthDate to 1972-07-31
    And User click OwnerAge checkbox
    And User click "Avanti" button
    And Wait more seconds
    And User click "Unica soluzione" button
    And User click "Solo RC AUTO" button
    And User click "Avanti" button


  Scenario: verifica dati - Confirm
    When User click "Verifica i dati" button
    And Wait few seconds
    And Set Check Data
      | statoCivile  | Divorziato      |
      | anno         | 1978            |
      | professione  | Artista         |
      | allestimento | Ka+ 1.2 8V 69CV |
    And User click "Conferma" button
    And Wait more seconds
    And Wait more seconds
    And User click "Verifica i dati" button
    Then Check Data should be
      | statoCivile  | Divorziato      |
      | anno         | 1978            |
      | professione  | Artista         |
      | allestimento | Ka+ 1.2 8V 69CV |
    When User click "Annulla" button
    Then page should not contain Professione
    And page should contain Quali sono le garanzie di cui hai bisogno?


  Scenario: page preventivo
    Given User click "DG783VP" button
    And User click "Calcola un preventivo" button
    And User click "Maggiore di 26 anni" button
    And User click "Avanti" button
    And User set birthDate to 1959-02-19
    And User click OwnerAge checkbox
    And User click "Avanti" button
    When Wait more seconds
    And Wait few seconds
    And User click "Verifica i dati" button
    And Wait few seconds
    And Set Check Data
      | statoCivile  | Separato          |
      | anno         | 2000              |
      | professione  | Artista           |
      | allestimento | 1.0 3 porte Sport |
    And User click "Conferma" button
    And Wait more seconds
    And User click "Avanti" button
    And Wait more seconds
    Then page should contain Ecco il tuo preventivo
    And page should contain Preventivo salvato! Ora verifica i dati e le tue garanzie, ti basta un click per acquistarlo!


  Scenario: page preventivo
    Given User click "DG783VP" button
    And User click "Calcola un preventivo" button
    And User click "Maggiore di 26 anni" button
    And User click "Avanti" button
    And User set birthDate to 1959-02-19
    And User click OwnerAge checkbox
    And User click "Avanti" button
    When Wait more seconds
    And Wait few seconds
    And User click "Verifica i dati" button
    And Wait few seconds
    And Set Check Data
      | antifurto   | Immobilizzatore o Satellitare |
      | statoCivile | Divorziato                    |
      | anno        | 1978                          |
      | professione | Artista                       |
      | ricovero    | Box privato                   |
      | tipoGuida   | Maggiore di 26 anni           |
    And User click "Conferma" button
    And Wait more seconds
    And User click "Avanti" button
    And Wait more seconds
    Then page should contain Ecco il tuo preventivo
    And page should contain Preventivo salvato! Ora verifica i dati e le tue garanzie, ti basta un click per acquistarlo!







