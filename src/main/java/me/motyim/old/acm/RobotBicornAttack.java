//http://codeforces.com/problemset/problem/175/A
package me.motyim.old.acm;

import java.util.Scanner;

public class RobotBicornAttack {

    public static void main(String[] args) {
        int max = -1 ;
        int s1=0,s2=0,s3=0;
        Scanner in = new Scanner(System.in);
        String s = in.next();
        
        if(s.length()<3 || s.length() >21){
            System.out.println(max);
            System.exit(0);
        }
        
        if(s.length()==3){
             max=0;
             for (int i = 0; i < s.length(); i++) {
                max+=s.charAt(i)-'0';
            }
            System.out.println(max);
            System.exit(0); 
        }
        
        for (int i = 1; i < s.length(); i++) {
            for (int j = i+1; j < s.length() ; j++) {
               
                if(s.substring(0, i).length()>7 || (s.charAt(0)=='0' && s.substring(0, i).length() >1 ))    
                continue;
                
                s1=Integer.parseInt(s.substring(0, i));
           //     System.out.println(s1);
                if(s1>1000000)
                    continue;
                
                if(s.substring(i, j).length()>7 || (s.charAt(i)=='0' && s.substring(i,j).length() >1 ))
                    continue;
                s2=Integer.parseInt(s.substring(i, j));
              //  System.out.println(s2);
                 if(s2>1000000)
                    continue;
              
                 if(s.substring(j,s.length()).length()>7 || (s.charAt(j)=='0' && s.substring(j,s.length()).length() >1 ))
                    continue;
                s3=Integer.parseInt(s.substring(j, s.length()));
              //  System.out.println(s3);
                 if(s3>1000000)
                    continue;
            //    System.out.println("----");
                max=Math.max(max, s1+s2+s3);
                
            }
            
        }
        
        System.out.println(max);
    }

}
