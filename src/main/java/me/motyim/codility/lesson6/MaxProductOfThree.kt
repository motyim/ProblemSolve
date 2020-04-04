package me.motyim.codility.lesson6

import kotlin.math.max

fun maxThree(A: IntArray): Int {

    A.sortDescending();
    return listOf(A[0]*A[1]*A[2],
            A[A.lastIndex]*A[A.lastIndex-1]*A[A.lastIndex-2],
            A[0]*A[1]*A[A.lastIndex],
            A[0]*A[A.lastIndex]*A[A.lastIndex-1]).max()!!
}
