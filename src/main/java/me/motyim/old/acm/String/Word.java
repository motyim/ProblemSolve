package me.motyim.old.acm.String;

import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String S =in.nextLine();
        char [] a =S.toCharArray();
        int lower =0;
        for (int i = 0; i <a.length; i++) {
            if(Character.isLowerCase(a[i]))
                lower++;
        }
        int upper=a.length-lower;
        if(upper>lower)
            S=S.toUpperCase();
        else if(lower>upper)
            S=S.toLowerCase();
        else S=S.toLowerCase();
        System.out.println(S);
    }
    
}
