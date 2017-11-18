//http://codeforces.com/problemset/problem/37/A
package me.motyim.old.acm;

import java.util.*;

public class Towers {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int [] a=new int[n];
        int [] h=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        int he=1;
        for (int i = 0; i < a.length-1; i++) {
            for (int j =i+1; j < a.length; j++) {
                //System.out.println(a[i]+" "+a[j]);
                if(a[i]==0)break;
                if(a[i]==a[j]){
                    h[i]++;
                    a[j]=0;
                    //System.out.println(a[i]+" sec "+a[j]);
                }              
            }  
            if(h[i]>=he){
                    he=h[i]+1;
                }
        }
        int lenght=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]!=0)
                lenght++;
        }
        
        System.out.println(he+" "+lenght);
    }
    
}
