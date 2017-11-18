package me.motyim.hackerrank.algorithm.warmup;

import java.util.Scanner;

/**
 * @author MotYim <mohamed.motyim@gmail.com>
 * @since 18-Nov-17
 */
public class TimeConversion {
    static String timeConversion(String s) {
        // Complete this function
        String timeSlot = s.substring(8);
        int hours = Integer.parseInt(s.substring(0,2));
        if("AM".equals(timeSlot)){
            if(hours == 12){
                return "00"+s.substring(2,8);
            }else return s.substring(0,8);
        }else{
            if(hours == 12) return s.substring(0,8);
            else  return (hours+12)+s.substring(2,8);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
