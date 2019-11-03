package main.java.com.wizeek.grokking_algorithms;

/**
 * Finds the maximum number in a list using recursion.
 */
class Exercise_4_3 {
    public static void main(String[] args) {
        System.out.println("Max is: " + max(new int[]{-5, 0, 55, 2}));
    }

    private static int max(int[] array) {
        if (array.length == 1) {
            return array[0];
        } else {
            int[] subArray = new int[array.length - 1];
            System.arraycopy(array, 1, subArray, 0, array.length - 1);
            return Math.max(array[0], max(subArray));
        }
    }
}