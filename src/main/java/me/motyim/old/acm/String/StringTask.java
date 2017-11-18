//http://codeforces.com/problemset/problem/118/A
package me.motyim.old.acm.String;

import java.util.ArrayList;
import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        s=s.toLowerCase();
        StringBuffer m=new StringBuffer(s);
        for(int i=0;i<m.length();i++){
            if(m.charAt(i)=='a'||m.charAt(i)=='o'||m.charAt(i)=='y'||
                    m.charAt(i)=='e'||m.charAt(i)=='u'||m.charAt(i)=='i'){
                m.deleteCharAt(i);
                i--;
            }
            else{
                m.insert(i,'.');
                i++;
            }
        } 
        System.out.println(m);
    }
    
}