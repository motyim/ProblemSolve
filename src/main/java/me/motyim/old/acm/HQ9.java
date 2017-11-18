package me.motyim.old.acm;
import java.util.Scanner;

//http://codeforces.com/problemset/problem/133/A
public class HQ9 {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String s =in.next();
        for (int i = 0; i < s.length(); i++) {
            char c =s.charAt(i);
            switch(c){
                case 'H': 
                case 'Q':
                //case '+':
                case '9':
                    System.out.println("YES");
                    System.exit(0);
            }
        }
        System.out.println("NO");
    }
    
}
