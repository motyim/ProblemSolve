// topcoder srm 283 div 250

package me.motyim.old.acm;

public class DiagonalDisproportion {

    public static void main(String[] args) {
        String [] s ={"190","828","373"};
        System.out.println(getDisproportion(s));
      
    }
    public static int getDisproportion(String[] matrix){
        int sum1=0,sum2=0;
        for (int i = 0; i < matrix.length; i++) {
            sum1+=Integer.parseInt(""+matrix[i].charAt(i));
            sum2+=Integer.parseInt(""+matrix[i].charAt(matrix.length-(i+1)));
        }

        return sum1-sum2;
    }
    
}
