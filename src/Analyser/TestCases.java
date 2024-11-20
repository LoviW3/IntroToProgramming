package Analyser;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class TestCases {
    //wanted to make a testcase for each major aspect of this program,

    @Test
    public void wordTest(){
        TextCounter tc = new TextCounter();
        String text = "Hey there friend! How are you doing?";
        tc.inputText(text);
        int actual = tc.wordCount;
        int expected = 7;
        assertEquals(expected, actual);
    }
    @Test
    public void charTest(){
        TextCounter tc = new TextCounter();
        String text = "Hey there friend! How are you doing?";
        tc.inputText(text);
        int actual = tc.charCount;
        int expected = 30;
        assertEquals(expected, actual);
    }

    @Test
    public void longestTest(){
        TextCounter tc = new TextCounter();
        String text = "Hey there friend! How are you doing?";
        tc.inputText(text);
        String actual = tc.longWord;
        String expected = "friend!";
        assertEquals(expected, actual);

    }

    @Test
    public void linesOfTextTest(){
        TextCounter tc = new TextCounter();
        String text = "Hey there friend! How are you doing?";
        tc.inputText(text);
        int actual = tc.lineCount;
        int expected = 1;
        assertEquals(expected, actual);
    }
}

