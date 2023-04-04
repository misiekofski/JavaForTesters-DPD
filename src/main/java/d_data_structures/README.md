## Data structures

#### Excercise 1
1.Utwórz Enum o nazwie BrowserType (w klasie BrowserType) który będzie zawierał cztery elementy:

- Chrome
- Edge
- Firefox
- Opera


#### Exercise 2
1. Odkomentuj kod klasy `public class DriverFactory`.
2. Popraw kod metody `getDriver()` tak aby dla każdego z elementów utworzonych w enumie zwracał stringa z nazwą wybranej przeglądarki.
3. Wywołaj metodę `getDriver()` w funkcji `main()` z róznymi parametrami enuma.


#### Exercise 3
Dokumentacja: https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html

1. W klasie `MyList` utwórz listę Stringów z imionami bohaterów gwiezdnych wojen
* Han Solo
* Luke Skywalker
* Darth Vader
* C-3PO
* Leia Organa
* Obi Wan Kenobi


2. Wydrukuj ostatni element listy
3. Odwróć kolejność elementów w liście
4. Wydrukuj jeszcze raz listę
5. Posortuj listę domyślną metodą
6. Wydrukuj pierwszy element listy


#### Task 4
Map dokumentacja: https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html

W klasie `MyMap`:
1. Stwórz mapę gdzie klucz i wartość są Stringami
2. Dodaj kolejne pary klucz->wartość:
* "browser" -> "chrome"
* "headless" -> "false"
* "res_width" -> "1920"
* "res_height" -> "1080"
3. Sprawdź czy mapa zawiera klucz `browser`
4. Odczytaj wartośc klucza `headless`
5. Usuń klucz `headless` 
6. Po usunięciu spróbuj odczytać klucz `headless` ponownie