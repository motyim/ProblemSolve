package me.motyim.hackerrank.crackingInterview;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SherlockValidStringTest {

    @Test
    public void testCase0(){
        assertEquals("NO",SherlockValidString.isValid("aabbcd"));
    }

    @Test
    public void testCase1(){
        assertEquals("NO",SherlockValidString.isValid("aabbccddeefghi"));
    }

    @Test
    public void testCase2(){
        assertEquals("YES",SherlockValidString.isValid("abcdefghhgfedecba"));
    }

}