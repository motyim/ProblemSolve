package me.motyim.old.acm;
//phase 1 abd elkream
import java.util.Scanner;
public class The_3n_plus_1_problem {
    public static void main (String[]args){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
        int i=in.nextInt();
        int j=in.nextInt();
        int MaxLength=1;
        int m=i,y=j;
        if(i>j){
            int temp=j;
            j=i;
            i=temp;
        }
        for(int x=i;x<=j;x++){
            int Length=1;
            int n=x;
            while(n!=1){
                if(n%2!=0) n = (3*n) + 1;
                else n = n / 2;
                Length++;
            }
           
            if(Length >= MaxLength)
                MaxLength=Length;
        }
        System.out.println(m+" "+y+" "+MaxLength);
        }
    }
    
}
