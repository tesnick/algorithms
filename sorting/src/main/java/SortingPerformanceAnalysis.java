import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * Created by Javier on 03/09/2016.
 */
public class SortingPerformanceAnalysis {

    private static Random randomGenerator = new Random();

    private static String BUBBLESORT = "BUBBLESORT";

    private static String INSERTIONSORT = "INSERTIONSORT";

    private static String MERGESORT = "MERGESORT";

    private static String QUICKSORT = "QUICKSORT";

    private static Map<String, Map<Integer, Long>> timeExecutionResults = new HashMap<>();

    public static void main(String[] args) throws IOException {

        int[] sizes = new int[] {10, 100, 1000, 10000, 100000, 200000};

        for(int size : sizes) {

            int[] originalUnsortedArray = generateRandomArray(size);

            //System.out.println("Array unsorted -> " + Arrays.toString(originalUnsortedArray));

            executeBubbleSort(size, originalUnsortedArray);

            executeInsertionSort(size, originalUnsortedArray);

            executeMergeSort(size, originalUnsortedArray);

            executeQuickSort(size, originalUnsortedArray);
        }

        writeResultsToCSV();
    }

    private static void writeResultsToCSV() throws IOException {

        CSVWriter writer = new CSVWriter(new FileWriter("./target/performanceResults.csv"), '\t');

        for (Map.Entry<String, Map<Integer, Long>> stringMapEntry : timeExecutionResults.entrySet()) {

            String sortAlgorithm = stringMapEntry.getKey();
            Map<Integer, Long> sizeAndTimeMap = stringMapEntry.getValue();

            for (Map.Entry<Integer, Long> integerLongEntry : sizeAndTimeMap.entrySet()) {

                Integer size = integerLongEntry.getKey();
                Long executionTime = integerLongEntry.getValue();

                String[] entries = new String[] {sortAlgorithm, size.toString(), executionTime.toString()};
                writer.writeNext(entries);
            }

        }

        writer.close();
    }

    private static void executeQuickSort(int size, int[] originalUnsortedArray) {

        int[] originalUnsortedArrayForQuickSort = new int[size];
        System.arraycopy(originalUnsortedArray, 0, originalUnsortedArrayForQuickSort, 0, originalUnsortedArray.length);

        long start = System.currentTimeMillis();
        QuickSort.sort(originalUnsortedArrayForQuickSort);
        long executionTime = System.currentTimeMillis() - start;

        System.out.println("QuickSort takes " + executionTime + " miliseconds to sort an " + size + " sized array.");
        //System.out.println("Sorted Array is: " + Arrays.toString(originalUnsortedArrayForQuickSort));

        Map<Integer, Long> integerLongMap = timeExecutionResults.get(QUICKSORT);
        if(integerLongMap == null) {
            integerLongMap = new HashMap<>();
            timeExecutionResults.put(QUICKSORT, integerLongMap);
        }

        integerLongMap.put(size, executionTime);
    }

    private static void executeMergeSort(int size, int[] originalUnsortedArray) {

        int[] originalUnsortedArrayForMergeSort = new int[size];
        System.arraycopy(originalUnsortedArray, 0, originalUnsortedArrayForMergeSort, 0, originalUnsortedArray.length);

        long start = System.currentTimeMillis();
        MergeSort.sort(originalUnsortedArrayForMergeSort, 1, originalUnsortedArrayForMergeSort.length);
        long executionTime = System.currentTimeMillis() - start;

        System.out.println("MergeSort takes " + executionTime + " miliseconds to sort an " + size + " sized array.");
        //System.out.println("Sorted Array is: " + Arrays.toString(originalUnsortedArrayForMergeSort));

        Map<Integer, Long> integerLongMap = timeExecutionResults.get(MERGESORT);
        if(integerLongMap == null) {
            integerLongMap = new HashMap<>();
            timeExecutionResults.put(MERGESORT, integerLongMap);
        }

        integerLongMap.put(size, executionTime);
    }

    private static void executeInsertionSort(int size, int[] originalUnsortedArray) {

        int[] originalUnsortedArrayForInsertionSort = new int[size];
        System.arraycopy(originalUnsortedArray, 0, originalUnsortedArrayForInsertionSort, 0, originalUnsortedArray.length);

        long start = System.currentTimeMillis();
        InsertionSort.sort(originalUnsortedArrayForInsertionSort);
        long executionTime = System.currentTimeMillis() - start;

        System.out.println("InsertionSort takes " + executionTime + " miliseconds to sort an " + size + " sized array.");
        //System.out.println("Sorted Array is: " + Arrays.toString(originalUnsortedArrayForInsertionSort));

        Map<Integer, Long> integerLongMap = timeExecutionResults.get(INSERTIONSORT);
        if(integerLongMap == null) {
            integerLongMap = new HashMap<>();
            timeExecutionResults.put(INSERTIONSORT, integerLongMap);
        }

        integerLongMap.put(size, executionTime);
    }

    private static void executeBubbleSort(int size, int[] originalUnsortedArray) {

        int[] originalUnsortedArrayForBubbleSort = new int[size];
        System.arraycopy(originalUnsortedArray, 0, originalUnsortedArrayForBubbleSort, 0, originalUnsortedArray.length);

        long start = System.currentTimeMillis();
        BubbleSort.sort(originalUnsortedArrayForBubbleSort);
        long executionTime = System.currentTimeMillis() - start;

        System.out.println("BubbleSort takes " + executionTime + " miliseconds to sort an " + size + " sized array.");
        //System.out.println("Sorted Array is: " + Arrays.toString(originalUnsortedArrayForBubbleSort));

        Map<Integer, Long> integerLongMap = timeExecutionResults.get(BUBBLESORT);
        if(integerLongMap == null) {
            integerLongMap = new HashMap<>();
            timeExecutionResults.put(BUBBLESORT, integerLongMap);
        }

        integerLongMap.put(size, executionTime);
    }

    private static int[] generateRandomArray(int size) {

        int[] array = new int[size];
        for(int i = 0 ; i  < array.length ; i++){
            array[i] = randomFill();
        }
        return array;
    }

    private static int randomFill(){
        int randomNum = randomGenerator.nextInt(100);
        return randomNum;
    }
}
