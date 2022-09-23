package insertionSort;

public class insertionSortUdemy {

    public static void main(String[] args) {
        int[] intArray = { 33, 2, 45, 3, 67, 889, 556, 2, 3 };

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {

            int operation_element_copy = intArray[firstUnsortedIndex]; // 45
            int position;
            for (position = firstUnsortedIndex; position > 0
                    && intArray[position - 1] > operation_element_copy; position--) {
                intArray[position] = intArray[position - 1];
            }
            intArray[position] = operation_element_copy;
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

}
