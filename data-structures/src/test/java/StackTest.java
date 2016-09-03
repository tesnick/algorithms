import org.junit.Assert;
import org.junit.Test;

/**
 * Created by tesnick on 31/08/16.
 */
public class StackTest {

    @Test
    public void stackPoPandPush() {

        Stack stack = new Stack();
        Assert.assertNull(stack.pop());
        stack.push(25);
        stack.push(35);
        stack.push(45);
        Assert.assertEquals(45, stack.pop());
        Assert.assertEquals(35, stack.peek());
    }
}
