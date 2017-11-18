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
public class MiniMaxSumTest {
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

        String testInput = "1 2 3 4 5";
        String expectedOutput  = "10 14";

        test(testInput, expectedOutput);
    }

    @Test
    public void testCase2(){

        String testInput = "256741038 623958417 467905213 714532089 938071625";
        String expectedOutput  = "2063136757 2744467344";

        test(testInput, expectedOutput);
    }

    @Test
    public void testCase3(){

        String testInput = "80 50 30 70 10";
        String expectedOutput  = "160 230";

        test(testInput, expectedOutput);
    }


    private void test(String testInput, String expectedOutput) {

        // After this he get input form inContent
        ByteArrayInputStream inContent  = new ByteArrayInputStream(testInput.getBytes());
        System.setIn(inContent);


        //call main method of class
        MiniMaxSum.main(null);

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