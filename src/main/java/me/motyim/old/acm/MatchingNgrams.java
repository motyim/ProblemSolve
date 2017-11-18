package me.motyim.old.acm;

import java.util.HashMap;
import java.util.Scanner;

public class MatchingNgrams {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1, s2;
        s1 = in.next();
        s2 = in.next();
        StringBuffer s3=new StringBuffer();
        HashMap m = new HashMap();
        for (int i = 0; i < s1.length(); i++) {
            if ((!m.containsKey(s1.charAt(i)) && !m.containsValue(s2.charAt(i))) || (char)m.get(s1.charAt(i))==s2.charAt(i) ) {
                m.put(s1.charAt(i), s2.charAt(i));
                s3.append(s1.charAt(i));              
            }else{
                s3.append('*');
            }
        }
        s2=new String(s3);
        
        if (s2.equals(s1)) {
            System.out.println("Match");
        } else {
            System.out.println("Not Match");
        }

    }
}
