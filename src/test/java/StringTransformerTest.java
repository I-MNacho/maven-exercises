import org.junit.Before;
import org.junit.Test;    //<-- added this import to make sure we can call methods below
import static org.junit.Assert.*;

public class StringTransformerTest {

    private StringTransformer st1;
    private StringTransformer st2;

    @Before
    public void setUp(){
        st1 = new StringTransformer("cat");
        st2 = new StringTransformer("codeup");

    }

    @Test
    public void testStringInstances(){
        assertNotNull(st1);
        assertNotNull(st2);
    }

    @Test
    public void testAllCaps(){
        assertEquals("CAT", st1.allCaps());
        assertEquals("CODEUP", st2.allCaps());
    }

    @Test
    public void testSpaced(){
        assertEquals("c a t", st1.spaced());
        assertEquals("c o d e u p", st2.spaced());
    }









}
