//http://codeforces.com/problemset/problem/25/A
package me.motyim.old.acm;

import java.util.Scanner;

public class IQTest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int [] a=new int [n];
        int Ceven=0,Cood=0,iEven=0,iOod=0;
        for (int i = 0; i < a.length; i++) {
            a[i]=in.nextInt();
            if(a[i]%2==0){
                Ceven++;
                iEven=i+1;
            }
            else{
                Cood++;
                iOod=i+1;
            }
        }
        if(Cood==1)
                System.out.println(iOod);
            else System.out.println(iEven);
    }
    
}
