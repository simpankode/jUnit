import org.junit.Test;
import static org.junit.Assert.*;

public class Testing {
    
    @Test
    public void test() {
        
        Hallo test = new Hallo();
        
        String result = test.testCase("one", "two");
        
        assertEquals("onetwo", result);
    }
}
