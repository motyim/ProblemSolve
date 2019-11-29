package me.motyim.hackerrank.algorithm;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ResultTest {

    @Test
    public void testSample1(){
        List<Integer> inputs = Arrays.asList(73, 67, 38, 33);
        List<Integer> outputs = Result.gradingStudents(inputs);
        List<Integer> expected = Arrays.asList(75,67,40,33);
        assertTrue("\noutput : "+outputs+"\nexpected : "+expected,expected.equals(outputs));
    }

}