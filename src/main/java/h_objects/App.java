package h_objects;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        IPriceable picasso = new Paint(-4, 5);
        IPriceable wenusMilo = new Sculpture();

        List<IPriceable> dzielaSztuki = new ArrayList<>();
        dzielaSztuki.add(picasso);
        dzielaSztuki.add(wenusMilo);

        for (IPriceable p : dzielaSztuki) {
            System.out.println("Cena dzieła sztuki : " + p.getPrice());
            System.out.println(p.getClass().getName());
        }
    }
}