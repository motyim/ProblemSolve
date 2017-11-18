//http://uva.onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=2113
package me.motyim.old.acm;
import java.util.Scanner;

public class RelationalOperators {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int [] [] m=new int [n][2];
        char [] c =new char [n];
        for (int i = 0; i < n; i++) {
            m[i][0]=in.nextInt();
            m[i][1]=in.nextInt();
            if(m[i][0]>m[i][1]){
                c[i]='>';
            }
            else if (m[i][0]<m[i][1]){
                c[i]='<';
            }
            else c[i]='=';
        }
        for (int i = 0; i < n; i++) {
            System.out.println(c[i]);
        }
        
    }
    
}
