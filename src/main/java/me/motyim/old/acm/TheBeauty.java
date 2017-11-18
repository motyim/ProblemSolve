

package me.motyim.old.acm;

public class TheBeauty {

    public static void main(String[] args) {
       
    }
    public static int find(int n){
        String s=""+n;
        int [] x=new int [10];
        char c;
        int y;
        int digit=0;
        for (int i = 0; i < s.length(); i++) {
            c=s.charAt(i);
            y=Integer.parseInt(""+c);
            if(x[y]==0){
                x[y]++;
                digit++;
            }
                
        }
        return digit;
    }
    
}
