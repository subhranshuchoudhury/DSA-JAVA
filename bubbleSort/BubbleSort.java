/*
 * Partition element from left to right
 * question: [20,35,-15,7,55,1,-22]
 * Ascending order
 */

/**
 * BubbleSort
 * In-place algorithm
 * O(n^2) time complexity - quadratic
 * 100 steps to sort 10 items. 10,000 steps to sort 100 items ...
 * Algorithm degrades quickly.
 * Lecture:
 * https://www.udemy.com/course/data-structures-and-algorithms-deep-dive-using-java/learn/lecture/8435764#overview
 */
public class BubbleSort {

    public static void main(String[] args) {

        int[] NumberArray = { 20, 35, -15, 7, 55, 1, -22 }; // length = 7, 0 - 6 index

        // loop from last to first.
        for (int lastUnSortedIndex = NumberArray.length - 1; lastUnSortedIndex > 0; lastUnSortedIndex--) {
            for (int i = 0; i < lastUnSortedIndex; i++) {
                if (NumberArray[i] > NumberArray[i + 1]) {
                    Swapper(NumberArray, i, i + 1);
                }
            }
        }

        for (int i = 0; i < NumberArray.length; i++) {
            System.out.println(NumberArray[i]);
        }
    }

    // swap function

    public static void Swapper(int[] array, int i, int j) { // array, index , index

        if (i == j) // if the index are same. swapping is unnecessary.
            return;

        int tempStore = array[i];

        array[i] = array[j];
        array[j] = tempStore;
    }
}