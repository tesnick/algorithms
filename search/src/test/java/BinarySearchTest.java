import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Javier on 04/09/2016.
 */
public class BinarySearchTest {

    @Test
    public void notFound_searchTest(){

        int[] array = new int[] { 22, 445, 23, 5, 10, 77 };

        // sort the array
        Arrays.sort(array);

        Assert.assertEquals(-1, BinarySearch.indexOf(array, 34));
    }

    @Test
    public void found_searchTest(){

        int[] array = new int[] { 22, 445, 23, 5, 10, 77 };

        // sort the array
        Arrays.sort(array);

        Assert.assertEquals(3, BinarySearch.indexOf(array, 23));
    }
}
