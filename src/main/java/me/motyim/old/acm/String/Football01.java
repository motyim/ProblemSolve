package me.motyim.old.acm.String;

import java.util.Scanner;

public class Football01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        char[]a=(in.nextLine()).toCharArray();
        int cnt1=0;
        int cnt0=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]=='1'){
                cnt1++;
                cnt0=0;
            }
            if(a[i]=='0'){
                cnt0++;
                cnt1=0;
            }
            if(cnt0>=7||cnt1>=7){
                System.out.println("YES");
                System.exit(0);
            }
        }
        System.out.println("NO");
    }
    
}
