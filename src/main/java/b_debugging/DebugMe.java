package b_debugging;

public class DebugMe {
    public static void main(String[] args) {
        int x = 5 * 12 - 32 + 1 * 2;
        String text = "Alice has " + x + " cats";
        Surprise.magicMethod();

        char[] weird = {
            'j',
            '\u006A',
            (char)106
        };

        for (char c: weird) {
            System.out.println(c);
        }

    }
}
