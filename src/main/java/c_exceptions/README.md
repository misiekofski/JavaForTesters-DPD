## Exceptions

#### Task 1
1. Uruchom program w klasie `OurExceptions.cs`
2. Dlaczego napis `And this should be printed regardless of everything` nie został wydrukowany?
3. Nie zmieniając wartości b ani obliczeń zmiennej c popraw program tak aby powyższy napis został wydrukowany.


#### Exercise 2
1. Wejdź do klasy `ThrowExceptions.cs` i przeczytaj kod aplikacji
2. Popraw metodę `getMaxElement()` tak żeby rzucała wyjątek `IllegalArgumentException` jeżeli długość tablicy przekazanej jako parametr wynosi 0 (tablica jest pusta)
3. Popraw kod metody `main()` tak aby aplikacja się uruchomiła i wydrukowała informację o pustej tablicy przekazanej jako parametr.

#### Exercise 3
1. Popraw klasę `TryCatchFinally.java` - upewnij się że napis `This should always be printed.` będzie drukował się zawsze (niezależnie od wcześniejszych błędów)
2. Dodaj obsługę wyjątku

Podpowiedź: możesz używać wielokrotnie bloku catch
```java
try {
    System.out.println(a.length());
} catch(IllegalArgumentException ex) {
    System.out.println("Exception has been caught");
} catch(SomeOtherException ex) {
    System.out.println("Other exception has been caught");
} catch(YetAnotherException ex) {
    System.out.println("Yet another exception has been caught");
}
```