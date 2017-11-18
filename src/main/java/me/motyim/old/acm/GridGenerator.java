// topcoder 256 div2 (250)
package me.motyim.old.acm;

public class GridGenerator {

    public static void main(String[] args) {
        int [] x= {1,0,3,4,1};
        int [] y={1,4,1,0,3};
        System.out.println(generate(x, y));
        
    }
    public static int generate(int[] row, int[] col){
        int [] [] m = new int [row.length][col.length];
        
        for (int i = 0; i < row.length; i++) {
            m[0][i]=row[i];
            if(i==0) continue;
            m[i][0]=col[i];
        }
        
        for (int i =1; i <row.length; i++) {
            for (int j = 1; j < col.length; j++) {
                m[i][j]=m[i-1][j-1]+m[i][j-1]+m[i-1][j];
            }
        }

     return m[row.length-1][col.length-1];
    }
}
