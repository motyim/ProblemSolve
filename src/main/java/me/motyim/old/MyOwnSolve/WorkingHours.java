/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.motyim.old.MyOwnSolve;

import java.util.Scanner;

/**
 *
 * @author Mohamed MotYim <mohamed.motyim@gmail.com>
 */
public class WorkingHours {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        boolean [] w ;
        int t =in.nextInt();
        while(t--!=0){
            int h =in.nextInt();
            w = new boolean [24];
            while(h--!=0){
                //System.out.println("H::"+h);
                int s =in.nextInt();
                int e =in.nextInt();
                
                    for (int i = (s+1)%24; i!=(e+1)%24; i=(i+1)%24) {
                      //  System.out.println("i::::"+i);
                        w[i]=true;
                    }
                
            }
            int c=0;
            for (int i = 0; i < w.length; i++) {
                if(w[i])
                c++;
            }
            System.out.println(c);
        }
    }
}
