package me.motyim.hackerrank.algorithm.strings;

import java.util.Scanner;

/**
 * @author MotYim <mohamed.motyim@gmail.com>
 * @since 8-Dec-17
 * link : https://www.hackerrank.com/challenges/separate-the-numbers/problem
 */

public class SeparatetheNumbers {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int a0 = 0; a0 < q; a0++) {
            String s = in.next();
            System.out.println(checkString(s));
        }
    }



    private static String checkString(String s) {
        StringBuffer sb = new StringBuffer();
        int lengthOFNumber = 1;

        if(s.length() < 2) return "NO";

        while(lengthOFNumber <= s.length()/2){
            sb.delete(0, sb.length());
            long min = Long.parseLong(s.substring(0, lengthOFNumber)) ;

            sb.append(min);
            int j = 1 ;
            while(sb.length() < s.length()){
                sb.append(min+j++);
            }

            if(sb.toString().equals(s)){
                return "YES " + min ;
            }else{
                lengthOFNumber++;
            }

        }

        return "NO";

    }
}
