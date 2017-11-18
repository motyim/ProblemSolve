/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.motyim.old.MyOwnSolve;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Mohamed MotYim <mohamed.motyim@gmail.com>
 */
public class ThunderBolt {
    
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int t =in.nextInt();
        while(t--!=0){
            int sum=0;
                    int b=in.nextInt();
                    int n=in.nextInt();
                    boolean[] prime;
                    prime = new boolean[n + 1];
                    Arrays.fill(prime, true);
                    prime[0] = false;
                    prime[1] = false;
                    int m = (int) Math.sqrt(n);

                    for (int i = 2; i <= m; i++) {

                        if (prime[i]) {
                            for (int k = i * i; k <= n; k += i) {
                                prime[k] = false;
                            }
                       }
                    }
                    for (int i = b; i <=n; i++) {
                        if(prime[i]){
                            String s =""+i;
                            int z=0;
                            for (int j = 0; j < s.length(); j++) {
                                z+=Integer.parseInt(""+s.charAt(j));
                            }
                            if(prime[z])
                                sum++;
                        }
                
                    }
                    System.out.println(sum);
            
        }
    }
    
    
}
