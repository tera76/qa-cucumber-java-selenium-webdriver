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


  Scenario: Go to rca fastquote
    When User click "Calcola un preventivo" button
    Then page should contain Se il guidatore ha meno di 26 anni rientra nella categoria “Guida Libera”, se ne ha più di 26 in “Guida Esperta”.

  Scenario: check Tipologia guida esperta
    When User click "Calcola un preventivo" button
    And User click "Minore di 26 anni" button
    Then page should contain Tipologia
    And page should contain Guida libera
    When User click "Maggiore di 26 anni" button
    Then page should contain Tipologia
    And page should contain Guida esperta

  Scenario: check sidebar
    Given User click "Calcola un preventivo" button
    And User click "Minore di 26 anni" button
    Then Sidebar should contain following values
      | Targa     | FS896YE      |
      | Tipologia | Guida libera |


  Scenario: check return home dialog
    Given User click "Calcola un preventivo" button
    When User click "Torna al Garage" button
    Then page should contain Aspetta, non uscire di strada
    When User click "Continua con il preventivo" button
    Then page should not contain Aspetta, non uscire di strada
    And page should contain Qual è l’età del guidatore più giovane?
    When User click "Torna al Garage" button
    And User click "Esci e torna alla home" button
    Then page should contain I TUOI VEICOLI
    And Page url should be https://mga-rca-web-dev.tera76tools.it/garage

