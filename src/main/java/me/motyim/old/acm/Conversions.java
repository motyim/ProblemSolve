package me.motyim.old.acm;

import java.util.Scanner;

public class Conversions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        double [] ar =new double [n];
        String [] sr =new String [n];
        for (int i = 0; i <n; i++) {
            double a=in.nextDouble();
            String k =in.next();
            switch (k){
                case "kg" :
                    sr[i]="lb";
                    ar[i]=a*2.2046;
                    break;
                case "lb" :
                    sr[i]="kg";
                    ar[i]=a*0.4536;
                    break;
                case "l"  :
                    sr[i]="g";
                    ar[i]=a*0.2642;
                    break;
                case "g"  :
                    sr[i]="l";
                    ar[i]=a*3.7854;
                    break;
            }
            
        }
        for (int i = 0; i < sr.length; i++) {

             System.out.format("%.4f %s %n", ar[i],sr[i]);

            
        }
    }
}
