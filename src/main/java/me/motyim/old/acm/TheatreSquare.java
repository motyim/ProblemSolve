package me.motyim.old.acm;
//phase 1 abd elkream
import java.util.Scanner;
public class TheatreSquare {
    public static void main(String[] args) {
        long n,m,a;
        Scanner in =new Scanner (System.in);
        n=in.nextLong();
        m=in.nextLong();
        a=in.nextLong();
       
           
        int nFlagstones=(int)Math.ceil(((double) n / a));
        int mFlagstones=(int)Math.ceil(((double) m / a));
        long num=(long)nFlagstones*mFlagstones;
        System.out.println(num);
      
    }
    
}
