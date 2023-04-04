## Obiekty

### Metody (obiekty)
#### Zadanie 1 - Ćwiczenia
1. Utwórz publiczną klasę Shape z właściwościami:
* publiczna szerokość int
* publiczna wysokość int

#### Zadanie 2 - Ćwiczenia
1. Utwórz publiczną klasę Rectangle, która dziedziczy po Shape
2. Utwórz w nim publiczną metodę int getArea(), która zwraca obszar (szerokość * wysokość)


#### Zadanie 3 - Sale lekcyjne
1. Utwórz publiczną klasę Paint, która dziedziczy po Rectangle
2. Utwórz w nim metodę getPrice() zwracającą cenę (powierzchnia * 400 EURO/m2)


#### Zadanie 4 – bawimy się przedmiotami
1. Utwórz obiekt Paint
2. Ustaw jego wysokość i szerokość
3. Wyświetl jego cenę

#### Zadanie 5 - konstruktory
1. Utwórz konstruktor klasy Paint, który wymaga wysokości i szerokości
2. Popraw poprzednie zadanie


#### Zadanie 6 - Interfejsy
1. Utwórz interfejs IPriceable, który definiuje funkcję getPrice()
2. Zmodyfikuj klasę Paint, aby zaimplementować interfejs IPriceable
3. Skomentuj tymczasowo zapisaną metodę getPrice w klasie Paint i zobacz, co się stanie


#### Ćwiczenie 7 - Interfejsy
1. Utwórz instancję klasy Paint
2. Utwórz instancję interfejsu IPriceable
3. Wywołaj na nich metody .getPrice().