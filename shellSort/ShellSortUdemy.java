package shellSort;

/*
 * comparing: https://youtu.be/9crZRd8GPWM?t=575
 * udemy theory: https://www.udemy.com/course/data-structures-and-algorithms-deep-dive-using-java/learn/lecture/8435780#content
 * implementation: https://www.udemy.com/course/data-structures-and-algorithms-deep-dive-using-java/learn/lecture/8435782#content
 * In-place algorithm
 * depends upon the gap.
 * gap = n/2, where n = length of array.
 * Worst case: O(n^2)
 * but it can perform much better than that
 * Does not require much shifting as insertion sort, so usually performs better
 * Unstable algorithm
 */

public class ShellSortUdemy {
    public static void main(String[] args) {

        int[] intArray = { 30, -90, 8, 123, 78, 76, 85, 912, 8 };

        for (int gap = intArray.length / 2; gap > 0; gap /= 2) {

            // int i = gap; // it the index to be compared with previous (i-gap) element.

            for (int i = gap; i < intArray.length; i++) {
                int newElement = intArray[i]; // save the element for swapping.
                int j = i; // give the index of i to j for comparing with previous element.

                while (j >= gap && intArray[j - gap] > newElement) {
                    intArray[j] = intArray[j - gap];
                    j -= gap;
                }

                intArray[j] = newElement;

            }

        }

        // print final array:
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}
