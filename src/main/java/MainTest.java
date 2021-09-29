import org.junit.Test;                              //added this import to make sure we can call methods below
import static org.junit.Assert.*;

public class MainTest {


    @Test                                            //<-- how you call the tests
    public void testTwoIsTwo(){                     //<-- usually has "test" before method to differentiate that its a test method
        assertEquals(2,2);          //<-- call method and give values expected
    }

    @Test
    public void testAssestions(){
        int num = 2;
        assertEquals(2, num);
    }

    @Test
    public void testReturnGreeting(){
        assertEquals("Well, hello!", Main.returnGreeting("hello"));
        assertEquals("Well, howdy!", Main.returnGreeting("howdy"));
        assertEquals("Well, good day!", Main.returnGreeting("good day"));
    }

    @Test
    public void testAdd(){
        assertEquals(4, Main.add(2, 2));
        assertEquals(5, Main.add(2, 3));

    }
}
