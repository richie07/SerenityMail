# new feature
# Tags: optional

Feature: Validate login

  @LoginEmail
  Scenario Outline: Succesful Login
    Given I use "<User>" and "<Password>"
    When perform Login action
    Then I should see my email accounts

    Examples:
    |User       |Password |
    |richiefpc  |Lima2020 |