//http://www.spoj.com/problems/CANDY/
package me.motyim.old.acm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CandyI {
    static int x =0;
    static int av;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double sum=0 ;
        ArrayList<Integer> l = new ArrayList<Integer>();
        int z=in.nextInt();
        while ( z!= -1) {
            l.add(z);
            sum+=z;
            z=in.nextInt();
        }

      av =(int)Math.ceil(sum/l.size());
        int[] a = new int[l.size()];
        for (int i = 0; i < a.length; i++) {
            a[i] = l.get(i);
        }
        boolean m =true ;
        while(a[0]!=0&&a[0]!=av){
            dox(a);
        }
        
        
        for (int b : a) {
            if(b!=av){
                m=false;
                break;
            }
    
        }
        System.out.println("=======");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+ " ");
        }
        System.out.println( x );
        if(!m)
            System.out.println("-1");

    }

    public static void dox(int[] a) {
        Arrays.sort(a);

        x++;
        int re =a[a.length-1]-av;

        a[a.length-1]=av;

        int i=0;
        while(re !=0){
            if(i==a.length-1){
                continue;
            }
            a[i]++;
            re--;
            i++;
            //System.out.println(a[i]+"  "+re);
        }

    
    }
}
