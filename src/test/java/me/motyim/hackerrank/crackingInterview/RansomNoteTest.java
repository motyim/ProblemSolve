package me.motyim.hackerrank.crackingInterview;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author MotYim <mohamed.motyim@gmail.com>
 * @since 11-Mar-18
 */
public class RansomNoteTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();


    @Before
    public void setUpStreams() {
        // After this all System.out.println() statements will come to outContent stream.
        System.setOut(new PrintStream(outContent));
        // After this all System.err.print() statements will come to errContent stream.
        System.setErr(new PrintStream(errContent));

    }

    @Test
    public void testCase1(){

        String testInput = "6 4\n" +
                "give me one grand today night\n" +
                "give one grand today";
        String expectedOutput  = "Yes";
        testCore(testInput, expectedOutput);

    }

    @Test
    public void testCase2(){

        String testInput = "6 5\n" +
                "two times three is not four\n" +
                "two times two is four";
        String expectedOutput  = "No";
        testCore(testInput, expectedOutput);

    }



    private void testCore(String testInput, String expectedOutput) {
        // After this he get input form inContent
        ByteArrayInputStream inContent  = new ByteArrayInputStream(testInput.getBytes());
        System.setIn(inContent);


        //call main method of class
        RansomNote.main(null);

        //trim to handle extra space
        String output = outContent.toString().trim();
        assertThat(output, is(expectedOutput));
        System.setIn(System.in);
    }


    @After
    public void cleanUpStreams() {
        //reset after end
        System.setOut(System.out);
        System.setErr(System.err);
    }


}