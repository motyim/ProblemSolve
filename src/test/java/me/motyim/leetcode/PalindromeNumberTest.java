package me.motyim.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by MotYim on 07-Oct-17.
 */
public class PalindromeNumberTest {


    @Test
    public void isPalindromeNegitiveNumber() throws Exception {
            assertFalse("negitive number not passed " , new PalindromeNumber().isPalindrome(-1));
    }

    @Test
    public void isPalindromeIntNumber_passed() throws Exception {
            assertTrue("int number not passed " , new PalindromeNumber().isPalindrome(121));
    }

    @Test
    public void isPalindromeIntNumber_Notpassed() throws Exception {
            assertFalse("int number passed " , new PalindromeNumber().isPalindrome(1213));
    }




}