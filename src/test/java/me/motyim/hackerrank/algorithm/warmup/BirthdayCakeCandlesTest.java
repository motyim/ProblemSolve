package me.motyim.hackerrank.algorithm.warmup;

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
 * @since 18-Nov-17
 */
public class BirthdayCakeCandlesTest {

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

        String testInput = "4\n" +
                "3 2 1 3";
        String expectedOutput  = "2";

        test(testInput, expectedOutput);
    }

    @Test
    public void testCase2(){

        String testInput = "6\n" +
                "1 1 1 1 1 1";
        String expectedOutput  = "6";

        test(testInput, expectedOutput);
    }

    @Test
    public void testCase3(){

        String testInput = "2\n" +
                "10000000 90000000";
        String expectedOutput  = "1";

        test(testInput, expectedOutput);
    }




    private void test(String testInput, String expectedOutput) {

        // After this he get input form inContent
        ByteArrayInputStream inContent  = new ByteArrayInputStream(testInput.getBytes());
        System.setIn(inContent);


        //call main method of class
        BirthdayCakeCandles.main(null);

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