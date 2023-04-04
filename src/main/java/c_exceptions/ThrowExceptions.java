package c_exceptions;

public class ThrowExceptions {
    public static void main(String[] args) {
        int[] arr1 = { };
        int[] arr2 = { 1, 11, 3, 4, 9 };

        try {
            System.out.println(getMaxElement(arr1));
        } catch (IllegalArgumentException e) {
            System.out.println("Empty array, skipping...");
        }

        System.out.println(getMaxElement(arr2));
    }

    private static int getMaxElement(int[] arr) {
        if (arr.length==0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        int max = 0;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }

        return max;
    }
}
