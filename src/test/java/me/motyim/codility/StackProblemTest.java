package me.motyim.codility;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author MotYim <mohamed.motyim@gmail.com>
 * @since 19-Oct-17
 */
public class StackProblemTest {

    @Test
    public void testCase1(){
        assertEquals(7, new StackProblem().solution("13 DUP 4 POP 5 DUP + DUP + -"));
    }

}