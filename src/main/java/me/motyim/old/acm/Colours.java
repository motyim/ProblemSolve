//http://www.spoj.com/problems/ABCD/
package me.motyim.old.acm;

import java.util.Scanner;

public class Colours {
  static int max ;
  static  int [] a = new int [4];
  static String s;
  static StringBuffer m;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
         s = in.next();
         m =new StringBuffer();
         
        for (int i = 0; i <4; i++) {
           a[i]=n;            
        }
        for (int i = 0; i <s.length(); ++i)
        --a[s.charAt(i)- 'A'];
        
        for (int i = 0; i < s.length(); i++) {
            if(i==0){
                if(a[0]!=0&&s.charAt(i)!='A') {
                    a[0]--;
                    m.append("A");
                  
                }
                
                else if(a[1]!=0&&s.charAt(i)!='B'){
                    a[1]--;
                    m.append("B");
                    
                }
                
                else if(a[2]!=0&&s.charAt(i)!='C'){
                    m.append("C");
                     a[2]--;
                }
                
                else if(a[3]!=0&&s.charAt(i)!='D'){
                    m.append("D");
                     a[3]--;
                }
            }else{
                 if(m.charAt(i-1)!='A'&&a[0]!=0&&s.charAt(i)!='A'){
                    a[0]--;
                    m.append("A");
                    
                }
                
                else if(m.charAt(i-1)!='B'&&a[1]!=0&&s.charAt(i)!='B'){
                    a[1]--;
                    m.append("B");
                    
                }
                else if(m.charAt(i-1)!='C'&&a[2]!=0&&s.charAt(i)!='C'){
                   m.append("C");
                     a[2]--;
                    
                }
                else if(m.charAt(i-1)!='D'&&a[3]!=0&&s.charAt(i)!='D'){
                     m.append("D");
                     a[3]--;
                    
                }
            }
            
        }
        System.out.println(m);
    }

       
}
