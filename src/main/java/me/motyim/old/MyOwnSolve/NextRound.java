/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.motyim.old.MyOwnSolve;

import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int r=0;
        int [] a = new int [n] ;
        for (int i = 0; i < a.length; i++) {
            a[i]=in.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            if(a[m-1]<= a[i]&&a[i]>0){
                r++;
            }
        }
        System.out.println(r);
    }
    
}
