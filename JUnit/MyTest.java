import org.junit.Test;
import static org.junit.Assert.*;

/**
 * MyTest
 */
public class MyTest {

    public String testCase(String one, String two) {
        return one + two;
    }
    
    public int testNumber(int one, int two) {
        return one + two;
    }

    @Test
    public void test() {

        MyTest test = new MyTest();

        String result = test.testCase("one", "two");

        assertEquals("onetwo", result);
    }

    @Test
    public void test2() {

        MyTest test = new MyTest();

        int result = test.testNumber(1, 2);

        assertEquals(3, result);
    }
}