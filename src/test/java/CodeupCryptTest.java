import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;


public class CodeupCryptTest {

@Test
    public void testVersion(){
    assertEquals(0.0, CodeupCrypt.version, 0);      //expected/predicted value, actual value ,delta variant or how much do you want it to match(0 = 100% match)
    CodeupCrypt.version = 1.0;                                    //give it a value
    assertEquals(1.0, CodeupCrypt.version, 0);     //test that new value
}

@Test
    public void testHashPassword(){
    assertEquals("", CodeupCrypt.hashPassword(""));
    assertEquals("444", CodeupCrypt.hashPassword("444"));
    assertEquals("333", CodeupCrypt.hashPassword("333"));
    assertEquals("c4t", CodeupCrypt.hashPassword("cat"));
    assertEquals("c4t", CodeupCrypt.hashPassword("cAt"));
    assertEquals("c4t", CodeupCrypt.hashPassword("cat"));
    assertEquals("c0d39p", CodeupCrypt.hashPassword("codeup"));
}

@Test
    public void testCheckPassword(){
    assertTrue(CodeupCrypt.checkPassword("c4t", "cat"));
    assertFalse(CodeupCrypt.checkPassword("c4t", "ca"));
    assertTrue(CodeupCrypt.checkPassword("c0d39p", "codeup"));
    assertTrue(CodeupCrypt.checkPassword("444", "444"));


}

}