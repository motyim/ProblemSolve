package me.motyim.leetcode;

import java.util.Locale;

/**
 * link : https://leetcode.com/problems/palindrome-number/description/
 * Created by MotYim on 07-Oct-17.
 */
public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        if(x < 0 )
            return false ;
        else {

            StringBuffer str = new StringBuffer(""+x);

            //reverse number
            str.reverse();

            // convert to wide number
            long num = Long.parseLong(str.toString());

            //check overflow
            if (num < Integer.MIN_VALUE || num > Integer.MAX_VALUE)
                return false ;
            else{
                return str.toString().equals(""+x);
            }

        }



    }
}
