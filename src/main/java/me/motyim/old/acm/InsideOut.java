package me.motyim.old.acm;

import java.util.Scanner;

public class InsideOut {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s =in.nextLine();
        System.out.println(unscramble(s));

    }

    public static String unscramble(String line) {
        int mid = line.length()/2;
        StringBuffer s1=new StringBuffer(line.substring(0, mid));
        s1.reverse();
        StringBuffer s2=new StringBuffer(line.substring(mid,line.length()));
        s2.reverse();
        return new String (s1+""+s2);
    }

}
