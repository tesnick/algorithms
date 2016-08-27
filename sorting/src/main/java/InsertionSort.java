/**
 * Created by tesnick on 27/08/16.
 */
public class InsertionSort {

    public static void sort(int[] unsortedArray) {

        for (int j = 1; j < unsortedArray.length; j++) {

            int key = unsortedArray[j];

            // insert unsortedArray[j] into the sorted sequence unsortedArray[1...j-1]
            int i = j - 1;
            while (i >= 0 && unsortedArray[i] > key) {
                unsortedArray[i + 1] = unsortedArray[i];
                i = i - 1;
            }

            unsortedArray[i + 1] = key;
        }
    }
}
