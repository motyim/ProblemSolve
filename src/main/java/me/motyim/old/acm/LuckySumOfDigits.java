//http://codeforces.com/problemset/problem/109/A
package me.motyim.old.acm;

import java.util.Scanner;

public class LuckySumOfDigits {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        StringBuffer s=new StringBuffer();
        while(x>0){
            if(x%7==0){
                x/=7;
                for(int i=x;i>0;i--){
                    s.append("7");
                }
                System.out.println(s);
                System.exit(0);
            }
            else {
                x-=4;
                if(x<0){
                    System.out.println("-1");
                    System.exit(0);
                }
                s.append("4");
            }
        }
        System.out.println(s);
    }
    
}
