import org.junit.Assert;
import org.junit.Test;

/**
 * Created by tesnick on 27/08/16.
 */
public class InsertionSortTest {

    @Test
    public void sortTest() {

        int[] unsortedArray = new int[]{5, 2, 4, 6, 1, 3};

        InsertionSort.sort(unsortedArray);

        Assert.assertEquals(1, unsortedArray[0]);
        Assert.assertEquals(2, unsortedArray[1]);
        Assert.assertEquals(3, unsortedArray[2]);
        Assert.assertEquals(4, unsortedArray[3]);
        Assert.assertEquals(5, unsortedArray[4]);
        Assert.assertEquals(6, unsortedArray[5]);


        Assert.assertTrue(unsortedArray[0] < unsortedArray[1]);
        Assert.assertTrue(unsortedArray[1] < unsortedArray[2]);
        Assert.assertTrue(unsortedArray[2] < unsortedArray[3]);
        Assert.assertTrue(unsortedArray[3] < unsortedArray[4]);
        Assert.assertTrue(unsortedArray[4] < unsortedArray[5]);
    }
}
