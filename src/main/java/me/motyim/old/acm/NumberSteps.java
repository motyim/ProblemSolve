package me.motyim.old.acm;
//phase 1 abd elkream
import java.util.Scanner;
public class NumberSteps {
    public static void main (String[]args){
       int x,y,z;
        Scanner in=new Scanner (System.in);
        z=in.nextInt();
        //make sure from your solve
        while (z-->0){
        x=in.nextInt();
        y=in.nextInt();
        if(x==0&&y==0) 
            System.out.println("0");
        else if (x==1&&y==1)
            System.out.println("1");
        else if(y==x || y==(x-2)){
            if(x%2==0){
                if(x==y)
                    System.out.println(x*2);
                if(y==(x-2))
                    System.out.println((x*2)-2);
        }
            else {
                if (x==y)
                    System.out.println((x*2)-1);
                if(y==(x-2))
                    System.out.println((x*2)-3);
            }
        }
        else
            System.out.println("No Number");
      
    }
   
    
    }
}
