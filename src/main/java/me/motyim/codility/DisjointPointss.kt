package me.motyim.codility

import java.util.*

fun solution(A: IntArray, B: IntArray): Int {

    val points = mutableListOf<Pair<Int,Int>>()

    for(i in 0..A.lastIndex  ){
        points.add(Pair(A[i],B[i]))
    }

    points.sortWith(compareBy({it.first},{it.second}))

    val stack = Stack<Pair<Int,Int>>();
    for (p in points){
        if(stack.empty()){
            stack.add(p)
        }

        if(isOverlap(stack.peek(),p)){
            stack.add(joinPoint(stack.pop(),p))
        }else
            stack.push(p)
    }

    return stack.size
}

fun joinPoint(p1: Pair<Int, Int>, p2: Pair<Int, Int>): Pair<Int, Int>  = Pair(p1.first,p2.second)

fun isOverlap(p1 : Pair<Int,Int>,p2:Pair<Int,Int>):Boolean = p1.second >= p2.first
