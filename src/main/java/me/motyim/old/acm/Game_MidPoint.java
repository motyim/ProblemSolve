
package me.motyim.old.acm;
//phase 1 abd elkream
import java.util.Scanner;
public class Game_MidPoint {
    public static void main(String[]args){
        int n,x1,x2,y1,y2,mx,my;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        while(n-->0){
            x1=in.nextInt();
            y1=in.nextInt();
            x2=in.nextInt();
            y2=in.nextInt();
            mx=(x1+x2)/2;
            my=(y1+y2)/2;
            System.out.println(mx+" "+my);
        }
    }
    
}
