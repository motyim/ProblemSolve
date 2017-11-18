//http://uva.onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=3166
package me.motyim.old.acm;

import java.util.Scanner;

public class GoogleisFeelingLucky {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int max=0;
        String ma="";
        int j=1;
        while(n-->0){
            for (int i = 0; i <3; i++) {
                String s=in.next();
                int v=in.nextInt();
                if(v==max){
                    ma=ma+"\n"+s;
                }
                if(v>max){
                    max=v;
                    ma=s;
                }
                
            }
            System.out.println("Case #"+j+":");
            System.out.println(ma);
            j++;
            }
        
        
    }
    
}

