import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;


public class MyFirstTest {

    // todo: create a test method that uses assertEquals or assertNotEquals to verify if the String Codeup is the same as Codeup
    @Test
    public void codeupTest() {
        assertEquals("Codeup","Codeup");
    }

    // todo: create a test method that uses assertNotSame to verify that the ArrayLists are not the same
    @Test
    public void listVerify() {
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();
        assertNotSame(languages,moreLanguages);
    }

    // todo: create a test method that uses assertArrayEquals to verify the arrays are equal
    @Test
    public void verifyArrays() {
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;
        assertArrayEquals(numbers,otherNumbers);
    }

    // todo: create a test method that uses both assertFalse and assertTrue to verify the statements
    @Test
    public void verifyStatements() {
        String language = "PHP";
        System.out.println(language.contains("H"));
        System.out.println(language.contains("J"));
//        assertFalse(language.contains("J"));
//        assertTrue(language.contains("H"));
    }
}
