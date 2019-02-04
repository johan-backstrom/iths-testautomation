# Lektion 1

- Jag kommer köra IntelliJ (Eclipse eller NetBeans 
funkar också, men jag kommer inte kunna stötta)
- Git
  - Installera
  - Grunder - https://git-scm.com/book/en/v2
  - Kommandon
    - Clone
    - Add
    - Commit
    - Pull
    - Push
  - Ändra "remote" för att pusha till nya repot!
- Maven
  - Dependency management
  - Bygg och Test
- Junit - http://www.vogella.com/tutorials/JUnit/article.html
  - Vad är unit-tester? (jmf. integration/system)
  - Snabba och oberoende
  - @Test-metoder
  - Assertions
  - Before/After
  - Kort om TDD
- Labba med Calculator
  - Vi skriver gemensamt kod för att testa kalkulator-klassen

# Lektion 2

Vi kommer gå djupare med JUnit.

- @Before, @After
- @BeforeClass, @AfterClass
- @Test (expected = Exception.class)
- @Ignore
- TDD
- Hamcrest och matchers (https://www.baeldung.com/hamcrest-custom-matchers)

## Lab 1

Implementera metoden calculateVehicleValue med hjälp av TDD. 
Den ska uppfylla följande krav:

- Bilen är värd 90% av sitt nypris
- För varje år blir den värd 20% mindre
- Beroende på skick blir den eventuellt mindre värd
  - Mint: Ingen förändring
  - Used: - 10000 kr
  - Crap: - 20000 kr
- Beroende på märke kan den vara mer värd:
  - Ferrari: + 20000 kr
  - Lamborghini + 10000 kr
- Värdet kan aldrig vara mindre än 0

## Lab 2

Skapa en metod som tar två integers som argument och returnerar en lista med alla primtal mellan dessa tal.

Refaktorisera lösningen så att metoden blir rekursiv. Har du skrivit bra tester i steg ett kommer de skydda 
dig när det blir svårt.

## Lab 3

Skapa en Hamcrest-matcher som validerar att
en sträng bara består av lower case tecken.

## Lab 4

Skapa en Hamcrest-matcher som validerar att
ett tal finns med i en lista med tal som skickas
in som argument till matchern.