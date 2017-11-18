//http://codeforces.com/problemset/problem/16/A
package me.motyim.old.acm;

import java.util.Scanner;

public class Flag {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        char [] [] a=new char[n][m];
        for (int i = 0; i <n; i++) {
            String []x=new String [1];
            x[0]=in.next();
            for (int j = 0; j <m ; j++) {
                a[i][j]=x[0].charAt(j);
            }
        }
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m-1 ; j++) {
                if(a[i][j]!=a[i][j+1]){
                    System.out.println("NO");
                    System.exit(0);
                }
                if(i!=n-1){
                    if(a[i][j]==a[i+1][j]){
                        System.out.println("NO");
                        System.exit(0);
                    }
                }
                
            }
        }
    
        System.out.println("YES");
    }
         
    
}
