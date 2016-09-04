/**
 * Bubble sort, sometimes referred to as sinking sort, is a simple sorting algorithm that repeatedly steps through
 * the list to be sorted, compares each pair of adjacent items and swaps them if they are in the wrong order.
 * The pass through the list is repeated until no swaps are needed, which indicates that the list is sorted.
 * The algorithm, which is a comparison sort, is named for the way smaller elements "bubble" to the top of the list.
 *
 * Time Complexity:
 *
 *        Best case  Average   Worst case
 *        Θ(n)       Θ(n^2)    O(n^2)
 *
 * More info: https://en.wikipedia.org/wiki/Bubble_sort
 *
 * Created by Javier on 03/09/2016.
 */
public class BubbleSort {

    public static int[] sort(int[] arr){
        int temp;
        for(int i=0; i < arr.length-1; i++){

            for(int j=1; j < arr.length-i; j++){
                if(arr[j-1] > arr[j]){
                    temp=arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
            //System.out.println((i+1)+"th iteration result: "+ Arrays.toString(arr));
        }
        return arr;
    }
}
