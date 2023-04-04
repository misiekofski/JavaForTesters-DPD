# Introduction to Java

## Simple variables

### Task 1

W klasie `Task1` utwórz zmienne typu
- int a 
- char b 
- double c
- long d
- bool e

Ustaw im prawidłowe (dopuszczalne) wartości.


### Task 2
W klasie `Task2` stwórz zmienną: 
- `int magic` ustaw jej wartość `2147483647`.
- dodaj do niej jeden (+1)

Co się stało?

### Task 3
```java
double y = 0.1;
double z = 0.2;
bool areEquals = y + z == 0.3;
```
 
Czy `0.1 + 0.2` jest równe `0.3` (w Javie)?

### Task 4
Wydrukuj w konsoli
`Tester był "bardzo" ucieszony z powodu notorycznego ignorowania raportów błędów przez developera`
(zwróć uwagę na cudzysłów w środku napisu)

## Conditionals 
### Task 5
Stwórz dwie zmienne:
- String imie
- int wiek

Wydrkuj napis w postaci "Imię, ma x lat i jest/nie jest pełnoletni" w zależności od podanego parametru wieku.

### Task 6
Użyj ternary operatora żeby zapisać krócej:

```java
double alcoholContent = 5.5;
String beerType;
if (alcoholContent >= 4) {
    beerType = "mocne";
}
else {
    beerType = "słabe";
}
```

### Task 7
Switch - wydrukuj nazwę dnia tygodnia w zależności od zmiennej `int dayOfTheWeek`.

1 -> Monday, 2 -> Tuesday, ... , 7 -> Sunday


## Functions
### Task 8
Napisz metodę, która zwróci wartość ceny `price` po rabacie `discount`. Rabat ma być podany jako liczba zmiennoprzecinkowa (20% rabatu będzie przekazane jako wartość 0.2)
```java
public static double calculatePrice(int price, double discount) {}
```

### Task 9
Napisz metodę, która przyjmuje trzy liczby (a, b oraz c) i zwraca największą z nich.
```java
public static double minFrom(double a, double b, double c) {}
```

### Task 10
Napisz metodę, która przyjmie trzy parametry
- String title
- String author
- String publisher
i zwraca napis w postaci `Hobbit, autorstwa JR. Tolkien wydany przez Wydawnictwo X`
- 
```java
public static String bookDetails(String title, String author, String illustrator) {}
```


### Task 11
Metoda ma przyjąć cztery parametry (liczbę, cenę jednostkową, rabat oraz spodziewaną kwotę do drugiego miejsca po przecinku) Liczba produktów (pcs) pomnożona przez cenę jednostkową (price) minus rabat procentowy od całości ma być równa oczekiwanej sumie. Metoda ma zwrócić true (kwota się zgadza) lub false (kwota się nie zgadza)

Podpowiedź: Użyj Math.round() do zaokrąglenia porównywanych kwot do jednego grosza.

https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Math.html#round(double)
```java
public static boolean validateSumWithDiscount(int pcs, double price, double discount, double expectedSum)
```

### Task 12
Metod `getQuadrant()` ma przyjąć dwa parametry, współrzędne x oraz y punktu na osi współrzędnych. Ma zwrócić (użyj funkcji switch) numer ćwiartki na układzie współrzędnych.

![Wyjaśnienie zadania 12](../../resources/images/quarters.png)