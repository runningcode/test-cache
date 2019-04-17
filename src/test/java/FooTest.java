import org.junit.Test;

public class FooTest {

    @Test
    public void fooTest() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new AssertionError(e);
        }
    }
}
