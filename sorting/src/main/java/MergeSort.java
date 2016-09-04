/**
 * In computer science, merge sort (also commonly spelled mergesort) is an efficient, general-purpose, comparison-based
 * sorting algorithm. Most implementations produce a stable sort, which means that the implementation preserves the
 * input order of equal elements in the sorted output. Mergesort is a divide and conquer algorithm that was invented by
 * John von Neumann in 1945
 *
 * Time Complexity:
 *
 *        Best case  Average    Worst case
 *        Θ(n log n) Θ(n log n) Θ(n log n)
 *
 * More info: https://en.wikipedia.org/wiki/Merge_sort
 *
 * Created by tesnick on 27/08/16.
 */
public class MergeSort {

    public static void sort(int[] unsortedArray, int p, int r) {

        if (p < r) {
            int q = (p + r) / 2;
            sort(unsortedArray, p, q);
            sort(unsortedArray, (q + 1), r);
            merge(unsortedArray, p, q, r);
        }
    }

    public static void merge(int[] unsortedArray, int p, int q, int r) {

        int n1 = q - p + 1;
        int n2 = r - q;

        int[] L = new int[n1 + 1];
        int[] R = new int[n2 + 1];

        for (int i = 0; i < n1; i++) {
            L[i] = unsortedArray[p + i - 1];
        }

        for (int j = 0; j < n2; j++) {
            R[j] = unsortedArray[q + j];
        }

        L[n1] = Integer.MAX_VALUE;
        R[n2] = Integer.MAX_VALUE;

        int i = 0;
        int j = 0;
        for (int k = (p - 1); k < r; k++) {
            if (L[i] <= R[j]) {
                unsortedArray[k] = L[i];
                i = i + 1;
            } else {
                unsortedArray[k] = R[j];
                j = j + 1;
            }
        }
    }
}
