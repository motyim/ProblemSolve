//http://codeforces.com/problemset/problem/122/A
package me.motyim.old.acm;

import java.util.Scanner;

public class LuckyDivision {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        for (int i = 2; i <=x; i++) {
            if(x%i==0){
                if(cheak(i)){
                    System.out.println("YES");
                    //System.out.println(i);
                    System.exit(0);
                }
            }
        }
        System.out.println("NO");
    }
    public static boolean cheak(int i){
        //System.out.println("frist i"+i);
        while(i!=0){
            int x=i%10;
           // System.out.println("x :"+x);
            if(x==7||x==4){
                i/=10;
                //System.out.println("i :"+i);
            }
            else return false;
        }
        return true;
    }
}
