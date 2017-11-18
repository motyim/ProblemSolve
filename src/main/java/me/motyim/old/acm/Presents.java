//http://codeforces.com/problemset/problem/136/A
package me.motyim.old.acm;

import java.util.Scanner;

public class Presents {

   
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n =in.nextInt();
        int [] a = new int [n];
        int [] b = new int [n];
        int Pi;
        for (int i = 0; i < n; i++) {
            a[i]=in.nextInt();
            Pi=a[i]-1;
            b[Pi]=i+1;
        }
        for (int i : b) {
            System.out.print(i+" ");
        }
    }
    
}
