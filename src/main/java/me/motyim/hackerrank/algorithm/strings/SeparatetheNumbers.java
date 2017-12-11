package me.motyim.hackerrank.algorithm.strings;

import java.util.Scanner;

/**
 * @author MotYim <mohamed.motyim@gmail.com>
 * @since 8-Dec-17
 * link : https://www.hackerrank.com/challenges/separate-the-numbers/problem
 * */

public class SeparatetheNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            System.out.println(checkString(s));
        }
    }

    private static long CheckStringWithInitLength(String s , int lengthOfNumber){
        boolean isBeaute  = true;
        long minStart = 0 ;

        for (int start = 0; start < s.length()/lengthOfNumber -1 ; ) {

            int a = Integer.parseInt(s.substring(start,start+lengthOfNumber));

            if(start== 0 ){
                minStart= a ;
            }

            start+=lengthOfNumber;

            //check if increase lengthOfNumber
            if((a + 1 )% 10 == 0) lengthOfNumber++;

            if(start+lengthOfNumber > s.length()) {
                isBeaute = false;
                break;
            }
            int b = Integer.parseInt(s.substring(start,start+lengthOfNumber));

            if(b - a != 1){
                isBeaute = false;
                break;
            }


        }


        return isBeaute ? minStart : -1 ;
    }

    private static String checkString(String s) {
        boolean isValid  = false ;

        int lengthOfNumber = 1 ;
        long min = 0;
        //handle if only one number
        if(s.length()==1) return "NO";

        //TODO : now only one try
        for (int i = 0; i < s.length()/2; i++) {
            if((min = CheckStringWithInitLength(s,lengthOfNumber)) == -1){
                lengthOfNumber++;
            }else{
                isValid = true ;
                break;
            }
        }

        return isValid ? "YES "+min:"NO";
    }
}
