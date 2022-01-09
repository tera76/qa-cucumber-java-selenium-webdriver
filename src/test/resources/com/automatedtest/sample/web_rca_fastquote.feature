@tera76

Feature: tera76 rca fastquote page

  Background: login
    Given A user navigates rca login page
    And Set username italia781
    And Set password italia781
    And Click access button


  Scenario: Go to rca fastquote
    When User click "Ottieni un preventivo rapido" button
    Then page should contain Quanti anni ha il guidatore più giovane?
    And page should contain Ottieni un preventivo rapido per la tua polizza auto rispondendo a poche semplici domande: Chi guiderà il veicolo Mercedes A180D targato CX000ZX?
    And page should contain Minore di 26 anni allora rientrerai nella categoria Guida libera; Altrimenti maggiore di 26 rientrerai nella Guida esperta
    And page should contain I servizi di distribuzione assicurativa tera76 sono offerti da tera76 Assicura s.r.l., intermediario n. AXXXXXXX Registro Unico Intermediari (RUI), che si avvale del collaboratore tera76 s.p.a. iscritto al RUI n. E000601244. Elaborazione preventivo a cura di [oppure, ma meno bene, in collaborazione con] Great Lakes, ai sensi dell’art. 131 D.Lgs. 209 del 7/9/2005. Verifica la correttezza delle informazioni che inserisci.

  Scenario: check Tipologia guida esperta
    When User click "Ottieni un preventivo rapido" button
    And User click "Minore di 26 anni" button
    Then page should not contain Tipologia
    When User click "Maggiore di 26 anni" button
    Then page should contain Tipologia

  Scenario: check sidebar
    Given User click "Ottieni un preventivo rapido" button
    And User click "Minore di 26 anni" button
    Then Sidebar should contain following values
      | targa      | AZ38328         |
      | decorrenza | 10 Giugno 2020  |
      | contraente | Francesco Galli |

  Scenario: check birth date page
    When User click "Ottieni un preventivo rapido" button
    And User click "Minore di 26 anni" button
    And User click "Avanti" button
    Then page should contain Data di nascita proprietario del veicolo
    And page should contain Inserisci la data di nascita del proprietario del veicolo


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