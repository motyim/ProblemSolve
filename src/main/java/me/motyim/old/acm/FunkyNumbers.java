//http://codeforces.com/problemset/problem/192/A
package me.motyim.old.acm;

import java.util.Scanner;

public class FunkyNumbers {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(n%2==0){
            n/=2;
            for (int i = 1; i <n/10; i++) {
            for (int j =1; j <n/10; j++) {
                if(n==(i*(i+1)/4)+(j*(j+1))/4){
                    System.out.println("YES");
                    System.out.println(i+" "+j);
                    System.exit(0);
                }
            }
            }
        }
        System.out.println("NO");
    }
    
}
