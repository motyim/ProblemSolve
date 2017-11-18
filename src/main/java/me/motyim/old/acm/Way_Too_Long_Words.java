package me.motyim.old.acm;
//phase 1 abd elkream
import java.util.Scanner;
public class Way_Too_Long_Words {
    public static void main(String[]args){
        int n; String s;
        Scanner in =new Scanner(System.in);
        n=in.nextInt();
        if(n>=1&&n<=100){
            while(n-->=0){
                s=in.nextLine();
                if(s.length()>10){
                    System.out.println((s.charAt(0))+""+(s.length()-2)+""+(s.charAt(s.length()-1)));
                }
                else System.out.println(s);
                
            }
        }
        
    }
    
}
