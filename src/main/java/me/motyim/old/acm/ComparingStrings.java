package me.motyim.old.acm;
//phase 1 abd elkream

import java.util.Scanner;

public class ComparingStrings {

    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
        StringBuffer s1 = new StringBuffer(in.nextLine());
        StringBuffer s2 = new StringBuffer(in.nextLine());
        StringBuffer s3=new StringBuffer();
        StringBuffer s4=new StringBuffer();
        if (s1.length() != s2.length()) {
            System.out.println("NO");
            System.exit(0);
        }
        int cnt = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                s3.append(s1.charAt(i));
                s4.append(s2.charAt(i));
                cnt++;
            }
            if(cnt > 2){
                System.out.println("NO");
                System.exit(0);
            }
        }
        s3.reverse();
        System.out.println(String.valueOf(s3).equals(String.valueOf(s4)) ? "YES":"NO");
    }
}
