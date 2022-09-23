package insertionSort;

/*
 * Lecture: https://www.youtube.com/watch?v=wWhAhp6PIuQ
 */

/**
 * InsertionSort
 * O(n^2)
 * stable algorithm
 * 100steps - 10items
 * In-place algorithm
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] Numbers = { 2, 4, 1, 224, 56, 78, 43, 23 };

        // 1,2,4,3..

        for (int i = 1; i < Numbers.length; i++) {

            int temp_store = Numbers[i];

            int j = i - 1;

            while (j >= 0 && Numbers[j] > temp_store) {
                Numbers[j + 1] = Numbers[j];
                j--;
            }
            Numbers[j + 1] = temp_store; // https://youtu.be/wWhAhp6PIuQ?t=713

            // Using For Loop.

            // int Jvalue;

            // for (Jvalue = i - 1; Jvalue >= 0 && Numbers[Jvalue] > temp_store; Jvalue--) {
            // Numbers[Jvalue + 1] = Numbers[Jvalue];

            // }

            // Numbers[Jvalue + 1] = temp_store;

        }

        for (int i = 0; i < Numbers.length; i++) {
            System.out.println(Numbers[i]);
        }
    }

}