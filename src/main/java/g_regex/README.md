### Definition

Wyrażenie regularne (w skrócie regex lub regexp) to ciąg znaków określający wzorzec wyszukiwania w tekście.


### Links
Do testowania wyrażeń regularnych:
- https://www.debuggex.com/ (dobry do testowania i rysowania)
- https://regex101.com/ (dobry do testowania i pisania)

#### Task 1 - working with files
Dokumentacja klasy Files: https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/file/Files.html

1. Utwórz plik tekstowy (z rozszerzeniem .txt) w folderze `/resources/textfiles` i wklej do niego treść poniżej
```text
Rower górski w Polsce kosztuje 2042,23 zł.
Komputer w USA kosztuje 2500 dolarów.
Samochód w Niemczech kosztuje 35 000 euro.
Piwo w sklepie kosztuje 3 zł.
```
2. Wczytaj plik do pamięci za pomocą kodu java (użyj readAllLines).

#### Task 2 - searching for text in files
Pattern class dokumentacja: https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/regex/Pattern.html
Matcher class dokumentacja: https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/regex/Matcher.html

1. W załadowanym pliku wyszukaj za pomocą wyrażeń regularnych:
   * wszystkie kwoty
   * wszystkie kraje
   * wszystkie przedmioty
2. Wydrukuj te elementy w konsoli