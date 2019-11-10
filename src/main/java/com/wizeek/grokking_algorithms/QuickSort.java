package main.java.com.wizeek.grokking_algorithms;

public class QuickSort {
    public static void main(String[] args) {
        int[] array1 = new int[]{33, 10, 15, 7};

        printArray(array1);
        printArray(sort(array1));
    }

    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    /**
     * Ugly sort. Actually creates new arrays after partitioning. Requires crutches like passing in real length of array.
     */
    private static int[] sort(int[] array) {
        return sort(array, array.length);
    }

    private static int[] sort(int[] array, int realLength) {
        if (realLength < 2) {
            return array;
        }
        if (realLength == 2) {
            if (array[0] > array[1]) {

                return new int[]{array[1], array[0]};
            } else {
                return array;
            }
        }
        int pivotIndex = realLength / 2;
        int pivotValue = array[pivotIndex];

        int[] smallerArray = new int[realLength];
        int[] largerArray = new int[realLength];

        int smallerIndex = 0;
        int largerIndex = 0;

        for (int i = 0; i < realLength; i++) {
            if (i == pivotIndex) {
                continue;
            }
            if (array[i] <= pivotValue) {
                smallerArray[smallerIndex++] = array[i];
            } else {
                largerArray[largerIndex++] = array[i];
            }
        }
        int[] mergedArray = new int[realLength];
        System.arraycopy(sort(smallerArray, smallerIndex), 0, mergedArray, 0, smallerIndex);
        System.arraycopy(sort(largerArray, largerIndex), 0, mergedArray, pivotIndex + 1, largerIndex);
        mergedArray[pivotIndex] = pivotValue;

        return mergedArray;
    }
}
