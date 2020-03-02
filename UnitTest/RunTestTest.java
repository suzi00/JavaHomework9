import org.junit.Test;

import static org.junit.Assert.*;

public class RunTestTest {

    @Test
    public void jTest(){
        RunTest test = new RunTest();
        int result = test.testNumber(3,9);
        assertEquals(12,result);
    }

}