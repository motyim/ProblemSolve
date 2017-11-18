package me.motyim.old.acm.String;

import java.util.Scanner;

public class Football {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int z=in.nextInt();
        String Frist =in.next();
        int Team1=1;
        int Team2=0;
        String Secand=new String();
        while(z-->1){
            String s=in.next();
            
            if(Frist.equals(s)){
                Team1++;
            }
                else {
                Team2++;
                Secand=s;
            }
        }
        System.out.println(Team1>Team2? Frist :Secand );
    }
    
}
