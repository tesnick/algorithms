/**
 *  BinarySearch is a search algorithm that finds the position of a target value within a sorted array.
 *  It compares the target value to the middle element of the array; if they are unequal, the half in
 *  which the target cannot lie is eliminated and the search continues on the remaining half until it
 *  is successful.
 *
 * Time Complexity:
 *
 *        Average   Worst case
 *        Θ(log n)  Θ(log n)
 *
 * More info: https://en.wikipedia.org/wiki/Binary_search_algorithm
 *
 * Created by Javier on 04/09/2016.
 */
public class BinarySearch {

    public static int indexOf(int[] a, int key){

        int lo = 0;
        int hi = a.length - 1;
        while(lo <= hi){

            int mid = lo + (hi-lo) / 2;

            if(key < a[mid])  hi = mid - 1;
            else if(key > a[mid]) lo = mid + 1;

            else return mid;
        }

        return -1;
    }
}
