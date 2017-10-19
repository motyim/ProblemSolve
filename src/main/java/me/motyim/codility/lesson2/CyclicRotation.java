package me.motyim.codility.lesson2;

/**
 * Created by MY-PC on 13-Oct-17.
 */
public class CyclicRotation {


    public int[] solution(int[] A, int K) {

        // empty Array
        if(A.length == 0 ) return A ;

        //if K greater Than Array Length
        if( K > A.length) K %= A.length;

        while( K-- > 0 )
        {

            int temp = A[A.length-1] ;

            for (int i = A.length-1; i  > 0 ; i--) {
                A[i] = A[i-1];
            }
            A[0] = temp ;

        }
        return A ;
    }



}
