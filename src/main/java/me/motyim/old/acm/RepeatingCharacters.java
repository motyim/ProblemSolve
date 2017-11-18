//https://icpcarchive.ecs.baylor.edu/index.php?option=onlinejudge&page=show_problem&problem=3811
package me.motyim.old.acm;

import java.util.Scanner;

public class RepeatingCharacters {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        while(n-->0){
            int m=in.nextInt();
            int r=in.nextInt();
            String S =in.next();
            System.out.print(m+" ");
            for (int i = 0; i < S.length(); i++) {
                for(int j=0;j<r;j++){
                    System.out.print(S.charAt(i));
                }
                
            }
            System.out.println("");
        }
        
    }
    
}
