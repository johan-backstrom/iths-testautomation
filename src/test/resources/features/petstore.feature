Feature: Manging pets in the perstore

  Background:
    Given a pet with id 123

  @petstore @fast
  Scenario: Delete a pet
    Given a pet with id 459872345
    When I delete the pet with id 459872345
    Then I get an error fetching the pet with id 459872345

  @slow
  Scenario: Create a pet
    Given the following pets
      | id  | name  | status    |
      | 123 | Olle  | avaliable |
      | 456 | Bengt | avaliable |
    Then I can get the pet with id 12345679

  Scenario Outline:
    Given a vehicle with brand "<brand>", new price <newPrice>, condition "<condition>" etc...
    Then the price of the vehicle should be <currentPrice>

    Examples:
      | brand   | newPrice | condition | yearOfManufacturing | currentPrice |
      | Volvo   | 400000   | mint      | 2019                | 360000       |
      | Ferrari | 1000000  | mint      | 2019                | 910000       |