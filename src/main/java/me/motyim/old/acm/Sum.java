//http://codeforces.com/problemset/problem/49/B
package me.motyim.old.acm;

import java.util.Arrays;
import java.util.Scanner;

public class Sum {

    static int max = 0;
    

    public static void main(String[] args) {
        int c=0;
        Scanner in = new Scanner(System.in);

        String n1 = Integer.toString(in.nextInt());
        String n2 = Integer.toString(in.nextInt());
        
        int[] num1 = new int[Math.max(n1.length(), n2.length())+1];
        int[] num2 = new int[Math.max(n1.length(), n2.length())+1];
        conv(num1,n1);
        conv(num2,n2);
//        System.out.println(max);
//         System.out.println(Arrays.toString(num1));
//          System.out.println(Arrays.toString(num2));
        int [] sum = new int [Math.max(n1.length(), n2.length())+1];
        
        for (int i = 0; i < sum.length; i++) {
            
            sum[i]=num1[i]+num2[i]+c;
            if(sum[i]>=max+1){
                c=1;
                sum[i]-=max+1;
            }else c=0;
            
        }
    // System.out.println(Arrays.toString(sum));
        
        if(sum[sum.length-1]==0)
            System.out.println(sum.length-1);
        else System.out.println(sum.length);
        


    }

    public static void conv(int[] x, String s) {
        for (int i = 0; i < s.length(); i++) {
            x[i] = s.charAt(s.length()-1-i) - '0';
            if(x[i]>max)
                max=x[i];
        }
        
    }


    }
