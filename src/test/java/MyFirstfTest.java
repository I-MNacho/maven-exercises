import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MyFirstfTest {

    @Test
    public void isCodeup(){
        assertEquals("Codeup", "Codeup");
//        assertNotEquals("Codeup", "Codeup");
    }

    @Test
    public void notSameArray(){
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();

        //use assertMethod
        assertNotSame(languages, moreLanguages);
    }

    @Test
    public void sameArray(){
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        //use assertMethod
        assertArrayEquals(numbers, otherNumbers);
    }


    @Test
    public void containsLetters(){
        String language = "PHP";
        language.contains("H"); // use assertTrue for this statement
        language.contains("J"); // use assertFalse for this statement

//        assertTrue("H", true);
//        assertFalse("J", false);

        assertTrue(language.contains("H"));
        assertFalse(language.contains("J"));
    }

}
