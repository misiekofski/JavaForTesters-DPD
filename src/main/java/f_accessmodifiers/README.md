## Access modifiers

#### Excercise 1
W klasie `AccessModifiers.cs` utwórz zmienne klasy jak poniżej (**nie** twórz tam metody `main()`)
1. private static String movie
2. protected static String writer
3. public static double budget
4. static String actor

i ustaw dla nich prawidłowe wartości.


#### Task 2
1. W klasie `TestModifiers.cs`, napisz kod który ustawi te cztery wartości
```java
public class TestModifiers {
    public static void main(String[] args) {
        AccessModifiers.writer = "Stephen King";
    }
}
```
2. Które wartości możesz ustawić
3. Przestaw klasę TestModifiers (drag & drop) do innej paczki (np. g_regex). Jaka jest różnica?


#### Task 3 - getters and setters
1. Utwórz klasę User z prywatnym polem `int age`;
2. Napisz do niego metodę publiczną (setter) ustawiającą wartość wieku, ale tylko jeśli podany wiek mieści się w przedziale <1, 150>
3. Napisz dla niego metodę publiczną (getter), która pobiera wartość wieku z pola prywatnego
4. Odkomentuj kod w klasie `GettersAndSetters` i uruchom go. Jakie jest wynik działania aplikacji?
