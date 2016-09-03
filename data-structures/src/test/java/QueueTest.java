import org.junit.Assert;
import org.junit.Test;

/**
 * Created by tesnick on 31/08/16.
 */
public class QueueTest {

    @Test
    public void queueEnDe() {

        Queue queue = new Queue();
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);

        Assert.assertEquals(5, queue.dequeue());
        Assert.assertEquals(6, queue.dequeue());
        Assert.assertEquals(7, queue.dequeue());
    }
}
