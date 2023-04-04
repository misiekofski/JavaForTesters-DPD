package b_debugging;

public class DebugConditional {
    public static void main(String[] args) {
        var v = 0;

        for (int i = 1000; i > 0; i--) {
            v = (i < 9999) ? (10 / i) : (10 * i);
        }

        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17 };
        double result = getAverage(nums);
        System.out.println(result);
    }

    public static double getAverage(int[] arr) {
        double result = 0;
        for (int i = 0; i<arr.length; i++) {
            result += arr[i];
        }
        return result/arr.length;
    }
}
