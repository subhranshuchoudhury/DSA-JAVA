package selectionSort;

/**
 * SelectionSort
 * In place algorithm
 * O(n^2) time complexity - quadratic
 * it will take 100 steps to sort 10 items, 10,000 steps to sort 100 item
 * does not require as much swapping as bubble sort
 * unstable algorithm (not preserve original index when we get duplicate
 * elements.)
 */
public class SelectionSort {
    public static void main(String[] args) {

        int[] Numbers = { 2, 56, 7, 34, -21 };

        // selection sort

        for (int unSortedLastIndex = Numbers.length - 1; unSortedLastIndex > 0; unSortedLastIndex--) {
            int largeNumberIndex = 0; // let the index 0 element is the largest one.
            for (int i = 1; i <= unSortedLastIndex; i++) {
                if (Numbers[i] > Numbers[largeNumberIndex]) {
                    largeNumberIndex = i;
                }
            }
            // swap
            swap(Numbers, unSortedLastIndex, largeNumberIndex);
        }

        // print the array.

        for (int i = 0; i < Numbers.length; i++) {
            System.out.println(Numbers[i]);
        }

    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = array[i];

        array[i] = array[j];
        array[j] = temp;

    }
}