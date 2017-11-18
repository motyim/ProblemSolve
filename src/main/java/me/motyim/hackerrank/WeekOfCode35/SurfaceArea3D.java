package me.motyim.hackerrank.WeekOfCode35;

import java.util.Scanner;

/**
 * @author MotYim <mohamed.motyim@gmail.com>
 * @since 15-Nov-17
 */
public class SurfaceArea3D {
    static int surfaceArea(int[][] A) {
        // compute upper and down face
        int area = A.length * A[0].length * 2;

        for (int i = 0; i < A.length; i++) {
            int row = 0 ;

            for (int j = 0; j < A[i].length; j++) {
                if(j==0) row = A[i][j];
                else if( A[i][j-1] < A[i][j]) row += A[i][j]-A[i][j-1];
            }
            area +=row*2 ;
        }

        for (int j = 0; j < A[0].length; j++) {
             int col = 0 ;

            for (int i = 0; i < A.length; i++) {
                if(i==0) col= A[i][j];
                else if( A[i-1][j] < A[i][j]) col+= A[i][j]-A[i-1][j];
            }
            area +=col*2 ;
        }


        return area ;
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int H = in.nextInt();
        int W = in.nextInt();
        int[][] A = new int[H][W];
        for(int A_i = 0; A_i < H; A_i++){
            for(int A_j = 0; A_j < W; A_j++){
                A[A_i][A_j] = in.nextInt();
            }
        }
        int result = surfaceArea(A);
        System.out.println(result);
        in.close();
    }
}
