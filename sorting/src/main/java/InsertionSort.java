/**
 * Insertion sort is a simple sorting algorithm that builds the final sorted array (or list) one item at a time.
 * It is much less efficient on large lists than more advanced algorithms such as quicksort, heapsort, or merge sort.
 * However, insertion sort provides several advantages:

    Simple implementation: Bentley shows a three-line C version, and a five-line optimized version[1]:116
    Efficient for (quite) small data sets, much like other quadratic sorting algorithms
    More efficient in practice than most other simple quadratic (i.e., O(n2)) algorithms such as selection sort or bubble sort
    Adaptive, i.e., efficient for data sets that are already substantially sorted: the time complexity is O(nk) when each element in the input is no more than k places away from its sorted position
    Stable; i.e., does not change the relative order of elements with equal keys
    In-place; i.e., only requires a constant amount O(1) of additional memory space
    Online; i.e., can sort a list as it receives it

 * Time Complexity:
 *
 *        Best case  Average   Worst case
 *        Θ(n)       Θ(n^2)    O(n^2)
 *
 * More info: https://en.wikipedia.org/wiki/Insertion_sort
 *
 * Created by tesnick on 27/08/16.
 */
public class InsertionSort {

    public static void sort(int[] unsortedArray) {

        for (int j = 1; j < unsortedArray.length; j++) {

            int key = unsortedArray[j];

            // insert key into the sorted sequence unsortedArray[1...j-1]
            int i = j - 1;
            while (i >= 0 && unsortedArray[i] > key) {
                unsortedArray[i + 1] = unsortedArray[i];
                i = i - 1;
            }

            unsortedArray[i + 1] = key;
        }
    }
}
