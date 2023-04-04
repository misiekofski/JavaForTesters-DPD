package e_functions;

import java.util.List;
import java.util.stream.IntStream;

public class NamesStream {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.range(1, 1001).boxed().toList();
        numbers.forEach(System.out::println);
    }
}
