/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package me.motyim.old.acm;

/**
 *
 * @author MohamedAhmed
 */
public class RugSizes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(rugCount(1));
    }
    public static int rugCount(int area){
        int n=0;
        for (int i = 1; i <= area; i++) {
            double j=(double)area/i;
            if(area%i==0){
                if(i!=j && i%2==0 &&j%2==0){
                   continue;
                }else{
                    if(j<i)
                        continue;
                    else
                    n++;
                }
            }   
        }
        return n;
    }
    
}
