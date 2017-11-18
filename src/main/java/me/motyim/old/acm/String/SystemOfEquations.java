//http://codeforces.com/problemset/problem/214/A
package me.motyim.old.acm.String;

import java.util.Scanner;

public class SystemOfEquations {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int Count=0;
        for (int i = 0; i <=n; i++) {
            for (int j = 0; j <=m; j++) {
                if((i*i)+j==n&&i+(j*j)==m)
                    Count++;
            }
        }
        System.out.println(Count);
    }
    
}
