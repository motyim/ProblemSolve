//http://codeforces.com/problemset/problem/14/A
package me.motyim.old.acm;

import java.util.Scanner;

public class Letter {
    public static void main(String[] args) {
        boolean t=true;
        Scanner in=new Scanner(System.in);
        int line=in.nextInt();
        int nn=0;
        int columns=in.nextInt();
        int StartLine=0,StartCol=columns,EndLine=0,EndCol=0;
        char [] [] m= new char [line][columns];
        //inter data
        while(nn<line){
            String s=in.next();
            for(int i=0;i<columns;i++){
                m[nn][i]=s.charAt(i);
                if(s.charAt(i)=='*'&&t){
                    StartLine=nn;
                    t=false;
                }
                if(s.charAt(i)=='*'){
                   EndLine=nn;
                }
            }
            nn++;
        }
        for (int i = 0; i <line; i++) {
            for (int j = 0; j <columns; j++) {
                if(m[i][j]=='*'&&j<=StartCol){
                    StartCol=j;
                }
                if(m[i][j]=='*'&&j>=EndCol){
                    EndCol=j;
                }
            }
            
        }
        Finsh(StartLine,StartCol,EndLine,EndCol,m);
       
    }
    public static void Finsh(int sl,int sc,int el,int ec,char[][]m){
        for (int i =sl; i <=el; i++) {
            for (int j =sc; j <=ec; j++) {
                System.out.print(m[i][j]);
            }
            System.out.println("");
        }
        System.exit(0);
    }
    
}
