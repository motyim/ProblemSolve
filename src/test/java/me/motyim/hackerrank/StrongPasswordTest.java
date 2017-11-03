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
 * @since 03-Nov-17
 */
public class StrongPasswordTest {

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

        String testInput = "3\nAb1";
        String expectedOutput  = "3";

        // After this he get input form inContent
        ByteArrayInputStream  inContent  = new ByteArrayInputStream(testInput.getBytes());
        System.setIn(inContent);


        //call main method of class
        StrongPassword.main(null);

        //trim to handle extra space
        String output = outContent.toString().trim();
        assertThat(output, is(expectedOutput));
        System.setIn(System.in);
    }

    @Test
    public void testCase2(){

        String testInput = "11\n#HackerRank";
        String expectedOutput  = "1";

        // After this he get input form inContent
        ByteArrayInputStream  inContent  = new ByteArrayInputStream(testInput.getBytes());
        System.setIn(inContent);


        //call main method of class
        StrongPassword.main(null);

        //trim to handle extra space
        String output = outContent.toString().trim();
        assertThat(output, is(expectedOutput));
        System.setIn(System.in);
    }

    @Test
    public void testCase3(){

        String testInput = "4\n4700";
        String expectedOutput  = "3";

        // After this he get input form inContent
        ByteArrayInputStream  inContent  = new ByteArrayInputStream(testInput.getBytes());
        System.setIn(inContent);


        //call main method of class
        StrongPassword.main(null);

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