package me.motyim.hackerrank.algorithm.strings;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SeparatetheNumbersTest {
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

        String testInput = "1\n1234";
        String expectedOutput  = "YES 1";
        testCore(testInput, expectedOutput);

    }

    @Test
    public void testCase2(){

        String testInput = "1\n2345";
        String expectedOutput  = "YES 2";
        testCore(testInput, expectedOutput);

    }

    @Test
    public void testCase3(){

        String testInput = "1\n3467";
        String expectedOutput  = "NO";
        testCore(testInput, expectedOutput);

    }

    @Test
    public void testCase4(){

        String testInput = "1\n1";
        String expectedOutput  = "NO";
        testCore(testInput, expectedOutput);

    }

    @Test
    public void testCase5(){
        String testInput = "1\n91011";
        String expectedOutput  = "YES 9";
        testCore(testInput, expectedOutput);
    }


    @Test
    public void testCase6(){
        String testInput = "1\n101112";
        String expectedOutput  = "YES 10";
        testCore(testInput, expectedOutput);
    }

    private void testCore(String testInput, String expectedOutput) {
        // After this he get input form inContent
        ByteArrayInputStream inContent  = new ByteArrayInputStream(testInput.getBytes());
        System.setIn(inContent);


        //call main method of class
        SeparatetheNumbers.main(null);

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