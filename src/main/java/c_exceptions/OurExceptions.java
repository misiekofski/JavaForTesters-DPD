package c_exceptions;

public class OurExceptions {
    public static void main(String[] args) {
        var a = 10;
        var b = 0;

        try {
            var c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }


        System.out.println("And this should be printed regardless of everything");
    }
}
