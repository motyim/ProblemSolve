package me.motyim.hackerrank;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * @author MotYim <mohamed.motyim@gmail.com>
 * @since 04-Nov-17
 */
public class MakingAnagramsTest {

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

        String testInput = "cde\nabc";
        String expectedOutput  = "4";
        testCore(testInput, expectedOutput);


    }

    @Test
    public void testCase2(){

        String testInput = "fcrxzwscanmligyxyvym\n" +
                "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
        String expectedOutput  = "30";
        testCore(testInput, expectedOutput);


    }

    private void testCore(String testInput, String expectedOutput) {
        // After this he get input form inContent
        ByteArrayInputStream inContent  = new ByteArrayInputStream(testInput.getBytes());
        System.setIn(inContent);


        //call main method of class
//        MakingAnagrams.main(null);
        MakingAnagrams2.main(null);

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