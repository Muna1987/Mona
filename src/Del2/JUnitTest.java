package Del2;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
public class JUnitTest {
    @Test

    public void text1Rows() {

        //Arrange

        TextCounter counter = new TextCounter();
        //testdata
        String text = "Hej";
        //Act
        //Spara antal rader
        counter.addText("text");
        //Actual: hämta antal rader
        int actual = counter.getRows();
        int expected = 1;
        //Assert
        assertEquals(expected, actual);
    }
    @Test

    public void testaddtext4Characters() {

        //Arrange

        TextCounter counter = new TextCounter();
        String text = "Mona";

        //Act
        counter.addText(text);
        int actual = counter.getCharactersnumbers();
        int expected = 4;
        //Assert
        assertEquals(expected, actual);
    }
    @Test

    public void text3RowsAnd12Characters() {

        //Arrange

        TextCounter counter = new TextCounter();
        String text = "text";

        //Act
        counter.addText("Mona");
        counter.addText("Heter");
        counter.addText("Jag");
        int actualRows = counter.getRows();
        int actualCharacters = counter.getCharactersnumbers();
        int expectedCharacters = 12;
        int expectedRows= 3;

        //Assert
        assertEquals(expectedRows, actualRows);
        assertEquals(expectedCharacters, actualCharacters);

    }
}
