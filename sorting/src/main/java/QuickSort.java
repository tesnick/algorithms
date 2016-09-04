/**
 * Quicksort (sometimes called partition-exchange sort) is an efficient sorting algorithm, serving as a systematic
 * method for placing the elements of an array in order. Developed by Tony Hoare in 1959, with his work published
 * in 1961, it is still a commonly used algorithm for sorting. When implemented well, it can be about two or three
 * times faster than its main competitors, merge sort and heapsort.
 *
 * Time Complexity:
 *
 *        Best case  Average    Worst case
 *        Θ(n log n) Θ(n log n) Θ(n^2)
 *
 * More info: https://en.wikipedia.org/wiki/Quicksort
 *
 * Created by tesnick on 2/09/16.
 */
public class QuickSort {

    private static int array[];

    private static int lenght;

    public static void sort(int[] inputArr) {

        if (inputArr == null || inputArr.length == 0) {
            return;
        }

        array = inputArr;
        lenght = inputArr.length;
        quickSort(0, lenght - 1);
    }

    private static void quickSort(int lowerIndex, int higherIndex) {

        int i = lowerIndex;
        int j = higherIndex;

        int pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];

        while (i <= j) {

            while (array[i] < pivot) {
                i++;
            }

            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                exChangeNumbers(i, j);
                i++;
                j--;
            }
        }

        if (lowerIndex < j) {
            quickSort(lowerIndex, j);
        }

        if (i < higherIndex) {
            quickSort(i, higherIndex);
        }
    }

    private static void exChangeNumbers(int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
