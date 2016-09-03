import org.junit.Test;

/**
 * Created by tesnick on 2/09/16.
 */
public class QuickSortTest {

    @Test
    public void searchTest() {

        QuickSort quickSort = new QuickSort();

        int[] input = {25, 2, 45, 20, 56, 75, 2, 65, 99, 53, 12};
        quickSort.sort(input);

        for (int value : input) {
            System.out.println("value -> " + value);
        }
    }
}
