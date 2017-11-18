package me.motyim.old.acm;
//phase 1 abd elkream
import java.util.Scanner;
import java.lang.StringBuilder;
public class Mispelling {
    public static void main (String[]args){
        int n;
        Scanner in=new Scanner (System.in);
        n=in.nextInt();
        if (n>=1&&n<=1000){
            int i=1;
            while(n-->0){              
                int m=in.nextInt();
                String s=in.next();
                if(s.length()<=80&&m<=s.length()){
                    StringBuilder S=new StringBuilder (s);
                    S.deleteCharAt(m-1);
                    System.out.println(i+" "+S);
                    i++;
                }
                
            }
        }
        
    }
    
}

