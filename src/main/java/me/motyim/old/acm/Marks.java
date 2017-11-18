//http://codeforces.com/problemset/problem/152/A
package me.motyim.old.acm;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        int nn=n;
        int m=in.nextInt();
        int [] [] mat= new int [n][m];
        while(nn-->0){
            String s=in.next();
            for(int i=0;i<m;i++){
                mat[nn][i]=s.charAt(i)-'0';
            }
        }
        
        int [] s=new int [n];
        for(int j=0;j<m;j++){
            int max=mat[0][j];
            //the num of stu
            int ns=0;
            for(int i=0;i<n;i++){
                if(mat[i][j]>max){
                    max=mat[i][j];
                    ns=i;
                } 
            }
            for(int i=0;i<n;i++){
                if(mat[i][j]==max){
                    s[i]++;
                }
            }
            
            s[ns]++;
        }
        int nos=0;
        for (int i = 0; i < s.length; i++) {
            if(s[i]!=0)
                nos++;
            
        }
        System.out.println(nos);
    }
       
    
}

