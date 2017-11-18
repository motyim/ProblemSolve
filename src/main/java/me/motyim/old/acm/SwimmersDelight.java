package me.motyim.old.acm;

//srm 250
public class SwimmersDelight {
    public static void main(String[] args) {
        int [] x= {3,6};
        int [] y= {5,2};
        System.out.println(longestJump(x,y));
    }
    public static int longestJump(int[] x, int[] y){
        int d=0;
        if(x[0]==x[1]){
           d= (x[0]>10-x[0])? x[0]:10-x[0] ;
        }else{
            if(x[0]>x[1]){
                change(x);
                change(y);
            }
           d=(x[0]>10-x[1]) ? x[0] : 10-x[1];
           int dis =(int) Math.round(Math.sqrt((x[0]-x[1])*(x[0]-x[1])  +(y[0]-y[1])*(y[0]-y[1]))); 
           if(dis > 10-x[0] || dis > x[1]){
               int min= (10-x[0]<x[1]) ? 10-x[0] : x[1] ;
               if(min > d)
                   d=min;
           }else{
               if(dis > d)
                   d=dis;
           }
           
        }
        return d;
    }
    public static void change(int [] x){
        int temp =x[1];
        x[1]=x[0];
        x[0]=temp;
    }
}
