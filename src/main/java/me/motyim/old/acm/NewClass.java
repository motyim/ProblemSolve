/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.motyim.old.acm;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author MohamedAhmed
 */
public class NewClass {
    public static void main(String[] args) {
        int match=0;
       String [] s ={"aa", "ab", "bb", "cc", "cd"};
        for (int i = 0; i < s.length; i++) {
            for (int j = i+1; j < s.length; j++) {
                match+=m(s[i],s[j]);
                
            }
            
        }
        System.out.println(match);
    }
    public static int m(String s1 ,String s2){
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
            return 1;
        } else {
            return 0;
        }

    }
    
}
