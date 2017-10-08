package me.motyim.leetcode;

/**
 * link : https://leetcode.com/problems/roman-to-integer/description/
 * Created by MotYim on 07-Oct-17.
 */
public class RomanToInteger {

    public int romanToInt(String s) {
        int num  = 0 ;
        for (int i = 0; i < s.length(); i++) {
            if(i != s.length()-1  && getValue(s.charAt(i)) < getValue(s.charAt(i+1)))
                num -= getValue(s.charAt(i));

            else num += getValue(s.charAt(i));
        }

        return num ;
    }

    /**
     * convert value of char in roman to integeral value
     * @param c
     * @return int value of roman character
     */
    int getValue(char c){
        switch (c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return -1 ; //not match any number
    }
}
