package me.motyim.codility

fun small(A: IntArray): Int {

    A.sort()

    var max = 1 ;
    for(i in A){
        if(i == max) max++
    }

    return max
}
