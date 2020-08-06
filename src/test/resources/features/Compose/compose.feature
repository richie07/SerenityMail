

Feature:Compose Email

  Scenario Outline: Compose Email
    Given I have "<User>" "<Password>" "<ToEmail>" "<Subject>" "<Body>" for compose email
    Given I use "<User>" and "<Password>"
    And perform Login action
    And I should see my email accounts
    When Compose email to "<ToEmail>"
    Then I should see my succesfull mail sent

    Examples:
    |User       |Password | ToEmail               | Subject       | Body      |
    |richiefpc  |Lima2020 | richiefpc@gmail.com   | Conociendote  | Hello ...!|