package main.java.com.wizeek.grokking_algorithms;

class Exercise_4_1 {
    public static void main(String[] args) {
        int sum = new Exercise_4_1().sum(new int[]{1, 2, 3, 4, 5});
        System.out.println("Sum is: " + sum);
    }

    private int sum(int[] array) {
        if (array.length == 0) {
            return 0;
        } else if (array.length == 1) {
            return array[0];
        } else {
            int[] smallerArray = new int[array.length - 1];
            System.arraycopy(array, 1, smallerArray, 0, smallerArray.length);
            return array[0] + sum(smallerArray);
        }
    }
}