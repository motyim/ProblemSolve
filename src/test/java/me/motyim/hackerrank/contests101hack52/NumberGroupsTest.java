package me.motyim.hackerrank.contests101hack52;

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
 * @since 04-Dec-17
 */
public class NumberGroupsTest {
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

        String testInput = "1";
        String expectedOutput  = "1";
        testCore(testInput, expectedOutput);


    }

    @Test
    public void testCase2(){

        String testInput = "2";
        String expectedOutput  = "8";
        testCore(testInput, expectedOutput);


    }

    @Test
    public void testCase3(){

        String testInput = "3";
        String expectedOutput  = "27";
        testCore(testInput, expectedOutput);
    }

    @Test
    public void testCase4(){

        String testInput = "4";
        String expectedOutput  = "64";
        testCore(testInput, expectedOutput);
    }

    @Test
    public void testCase5(){

        String testInput = "348150";
        String expectedOutput  = "42198712293375000";
        testCore(testInput, expectedOutput);
    }

    @Test
    public void testCase6(){

        String testInput = "1000000";
        String expectedOutput  = "1000000000000000000";
        testCore(testInput, expectedOutput);
    }


    private void testCore(String testInput, String expectedOutput) {
        // After this he get input form inContent
        ByteArrayInputStream inContent  = new ByteArrayInputStream(testInput.getBytes());
        System.setIn(inContent);


        //call main method of class
//        MakingAnagrams.main(null);
        NumberGroups.main(null);

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