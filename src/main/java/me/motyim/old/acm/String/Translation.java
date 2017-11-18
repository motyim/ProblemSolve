package me.motyim.old.acm.String;
import java.util.Scanner;
public class Translation {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        StringBuffer t=new StringBuffer(in.nextLine());
        System.out.println(s.equals(String.valueOf(t.reverse()))? "YES":"NO");
        
        
    }
    
}
