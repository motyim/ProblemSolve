package me.motyim.hackerrank.worldcodesprint12;

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
 * @since 15-Dec-17
 */
public class BreakingSticksTest {
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

        String testInput = "1\n1";
        String expectedOutput  = "1";
        testCore(testInput, expectedOutput);

    }

    @Test
    public void testCase2(){

        String testInput = "1\n2";
        String expectedOutput  = "3";
        testCore(testInput, expectedOutput);

    }


    @Test
    public void testCase3(){

        String testInput = "1\n3";
        String expectedOutput  = "4";
        testCore(testInput, expectedOutput);

    }


    @Test
    public void testCase4(){

        String testInput = "1\n4";
        String expectedOutput  = "7";
        testCore(testInput, expectedOutput);

    }

    @Test
    public void testCase5(){

        String testInput = "1\n5";
        String expectedOutput  = "6";
        testCore(testInput, expectedOutput);

    }

    @Test
    public void testCase6(){

        String testInput = "1\n6";
        String expectedOutput  = "10";
        testCore(testInput, expectedOutput);

    }

    @Test
    public void testCase7(){

        String testInput = "1\n7";
        String expectedOutput  = "8";
        testCore(testInput, expectedOutput);

    }

    @Test
    public void testCase8(){

        String testInput = "1\n8";
        String expectedOutput  = "15";
        testCore(testInput, expectedOutput);

    }

    @Test
    public void testCase9(){

        String testInput = "3\n1 7 24";
        String expectedOutput  = "55";
        testCore(testInput, expectedOutput);

    }



    private void testCore(String testInput, String expectedOutput) {
        // After this he get input form inContent
        ByteArrayInputStream inContent  = new ByteArrayInputStream(testInput.getBytes());
        System.setIn(inContent);


        //call main method of class
        BreakingSticks.main(null);

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