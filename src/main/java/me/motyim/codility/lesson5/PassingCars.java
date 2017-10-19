package me.motyim.codility.lesson5;

/**
 * https://codility.com/demo/results/training9X4S6S-CZK/
 * Created by MY-PC on 16-Oct-17.
 */
public class PassingCars {
    public int solution(int[] A) {
        int passing = 0 ;
        int Q = 0 ;

        for (int i = 0; i < A.length; i++) {
            if(A[i] == 1 ) Q++ ;
        }


        for (int i = 0; i < A.length; i++) {
            if(A[i]==0  && Q > 0 ){
                passing += Q ;
            }else{
                Q--;
            }
            if(passing > 1000000000 ) return -1 ;
        }
        return passing;
    }
}
