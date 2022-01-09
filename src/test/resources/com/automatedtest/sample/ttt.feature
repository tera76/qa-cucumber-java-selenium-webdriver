@tera76 @ttt

Feature: tera76 rca fastquote page


  Background: login
    Given A user navigates rca login page
    And Set username TestRca261
    And Set password TestRca261
    And Click access button


  Scenario: check step Configura polizza
    Given User click "EA511VH" button
    And User click "Ottieni un preventivo rapido" button
    And User click "Maggiore di 26 anni" button
    And User click "Avanti" button
    And User set birthDate to 04/02/1980
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
      | tipoGuida   | Maggiore di 26 anni          |
    And User click "Conferma" button
    And Wait more seconds
    Then page should not contain Anno conseguimento patente





  Scenario: check helper
    Given User click "Ottieni un preventivo rapido" button
    And User click "Minore di 26 anni" button
    And User click "Avanti" button
    And page should not contain Hai bisogno di aiuto?
    And page should not contain Se hai bisogno di supporto scriverci una email:
    When Click help icon
    Then page should contain Hai bisogno di aiuto?
    And page should contain Se hai bisogno di supporto scriverci una email:
    And page should contain supporto@tera76pay.it
    And page should contain per qualsiasi necessità, chiama l’assistenza al numero
    And page should contain +39 039 000 000 00




  Scenario: check pit-stop
    Given User click "Ottieni un preventivo rapido" button
    And User click "Minore di 26 anni" button
    And User click "Avanti" button
    And User set birthDate to 14/05/1976
    When User click "Avanti" button
    Then page should contain Un rapido pit-stop e si riparte!
    And page should contain Il tuo preventivo è quasi pronto...
