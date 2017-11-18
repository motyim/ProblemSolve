package me.motyim.old.acm;
//phase 1 abd elkream
import java.util.Scanner;
public class AddingReversedNumbers {
    public static void main(String[] args) {
        int z;
        Scanner in=new Scanner(System.in);
        z=in.nextInt();
        while(z-->0){
            int x=in.nextInt();
            int y=in.nextInt();
            x=RemoveZero(x);
            y=RemoveZero(y);
            // can i make reverse with StringBuffer
            x=Reverse(x);
            y=Reverse(y);
            int r=x+y;
            r=Reverse(r);
            r=RemoveZero(r);
            System.out.println(r);
        }
    }
    public static int RemoveZero(int x){
        while(x%10==0){
                x/=10;
            }
        return x;
    }   
    public static int Reverse(int x){
            String s="";
            while(x/10.0!=0){
               s+=(x%10);
               x=x/10;
           }
          return x=Integer.parseInt(s);
        }
}
