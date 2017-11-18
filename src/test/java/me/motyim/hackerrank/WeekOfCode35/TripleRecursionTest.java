package me.motyim.hackerrank.WeekOfCode35;

import me.motyim.hackerrank.WeekOfCode35.TripleRecursion;
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
 * @since 15-Nov-17
 */
public class TripleRecursionTest {
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

        String testInput = "5 10 7";

        String expectedOutput  = "10 9 8 7 6\n" +
                "9 17 16 15 14\n" +
                "8 16 24 23 22\n" +
                "7 15 23 31 30\n" +
                "6 14 22 30 38";

        // After this he get input form inContent
        ByteArrayInputStream inContent  = new ByteArrayInputStream(testInput.getBytes());
        System.setIn(inContent);


        //call main method of class
        TripleRecursion.main(null);

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