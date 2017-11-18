package me.motyim.hackerrank.WeekOfCode35;

import jdk.nashorn.internal.ir.annotations.Ignore;
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
 * @since 17-Nov-17
 */
public class HighwayConstructionTest{

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

            String testInput = "1\n" +
                    "4 2";

            String expectedOutput  = "13";

            // After this he get input form inContent
            ByteArrayInputStream inContent  = new ByteArrayInputStream(testInput.getBytes());
            System.setIn(inContent);


            //call main method of class
            HighwayConstruction.main(null);

            //trim to handle extra space
            String output = outContent.toString().trim();
            assertThat(output, is(expectedOutput));
            System.setIn(System.in);
        }

    @Test
    public void testCase2(){

        String testInput = "1\n" +
                "5 3";

        String expectedOutput  = "99";

        // After this he get input form inContent
        ByteArrayInputStream inContent  = new ByteArrayInputStream(testInput.getBytes());
        System.setIn(inContent);


        //call main method of class
        HighwayConstruction.main(null);

        //trim to handle extra space
        String output = outContent.toString().trim();
        assertThat(output, is(expectedOutput));
        System.setIn(System.in);
    }


    @Test @Ignore
    public void testCase3(){

        String testInput = "1\n" +
                "4 10";

        String expectedOutput  = "99";

        // After this he get input form inContent
        ByteArrayInputStream inContent  = new ByteArrayInputStream(testInput.getBytes());
        System.setIn(inContent);


        //call main method of class
        HighwayConstruction.main(null);

        //trim to handle extra space
        String output = outContent.toString().trim();
        assertThat(output, is(expectedOutput));
        System.setIn(System.in);
    }

    @Test
    public void testCase4(){

        String testInput = "1\n" +
                "10000000000 200";

        String expectedOutput  = "809483489";

        // After this he get input form inContent
        ByteArrayInputStream inContent  = new ByteArrayInputStream(testInput.getBytes());
        System.setIn(inContent);


        //call main method of class
        HighwayConstruction.main(null);

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