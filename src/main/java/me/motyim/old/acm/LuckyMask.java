//http://codeforces.com/problemset/problem/146/B
package me.motyim.old.acm;

import java.util.Scanner;

public class LuckyMask {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int n=a+1;
        while(true){
            //System.out.println(n);
            //System.out.println("-- "+mask(n));
           if(mask(n)==b){
               System.out.println(n);
               System.exit(0);
           }
           n++;
        }
        
    }
    public static int mask(int n){
        String s=""+n;
        StringBuffer b=new StringBuffer();
        for (int i = 0; i <s.length(); i++) {
            if(s.charAt(i)=='4'){
                b.append('4');
            }
            if(s.charAt(i)=='7'){
                b.append('7');
            } 
        }
        //System.out.println("=="+b);
        if(b.length()!=0){
        return Integer.parseInt(new String(b));}
        else return n;
        

    }
    
}
