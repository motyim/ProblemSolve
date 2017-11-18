//http://www.spoj.com/problems/HOTELS/
package me.motyim.old.acm;
import java.util.Arrays;
import java.util.Scanner;

public class HotelsAlongtheCroatianCoast {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int []a=new int [n];
        int [] p=new int [n];
        for (int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        
        for(int j=0;j<n;j++){
        int sum=0;
        for (int i = j; i <n; i++) {
           //System.out.println("here sum+"+a[i]);
           sum+=a[i];
            //System.out.println(sum+"==="+m);
           if(i<a.length-1){
               if(sum+a[i+1]>m){
                   break;
               }
           }
           if(sum>=m)
               break;
        }
          // System.out.println(sum);
        p[j]=sum;  
    }
        int maxh=0;
        for (int i = 0; i < p.length; i++) {
            if (p[i]>=maxh&&p[i]<=m)
                maxh=p[i];
        }
        System.out.println(maxh);
    }
    
}
