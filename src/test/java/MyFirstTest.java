
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;


public class MyFirstTest {

    //Testing Code with JUnit LECTURE
    @Test
    public void testIfCompanyNameIsEquals() {
        String expected = "Codeup";
        String actual = "Codeup";
        //String actual = "codeup";  CREATES ERROR X

        assertEquals(expected, actual);
    }

// When you're using floating points values a third parameter is required (Delta) which represents a
// positive margin of error of decimals.

    @Test
    public void testIfChangeIsCorrect() {
        Double price = 10.0;
        Double discount = 4.5;

        assertEquals(5.5, price - discount, 0);
        assertEquals(5.1, price - discount, 0.5);
        assertNotEquals(4.9, price - discount, 0.5);
    }

    @Test
    public void testIfObjectsAreDifferent() {
        Object dog = new Object();
        Object sheep = new Object();
        Object clonnedSheep = sheep;

        assertNotSame(sheep, dog);
        assertSame(sheep, clonnedSheep);
    }

    @Test
    public void testIfArrayEquals() {
        char[] expected = {'J','u','n','i','t'};
        char[] actual = "Junit".toCharArray();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testIfGreaterOrLesserThanWorks() {

        boolean learningTDD = true;

        assertTrue(learningTDD);
        assertTrue("5 is greater than 4", 5 > 4);
        assertFalse("5 is not greater than 6", 5 > 6);
    }

    //WARMUP EXERCISES
    @Test
    public void testIfStringMatches(){
        String company = "Codeup";
        assertEquals("Codeup", company);
        assertNotEquals("CodeUp", company);
    }

    @Test
    public void testIfListsAreNotTheSame(){
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();
        assertNotSame(languages, moreLanguages);
    }

    @Test
    public void testIfArraysAreEqual(){
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;
        assertArrayEquals(numbers, otherNumbers);
    }

    @Test
    public void testIfWordContains(){
        String language = "PHP";
        assertTrue(language.contains("H")); // use assertTrue for this statement
        assertFalse(language.contains("J")); // use assertFalse for this statement
    }
}
