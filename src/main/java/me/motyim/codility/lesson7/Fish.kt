package me.motyim.codility.lesson7

import java.util.*


fun fish(A: IntArray, B: IntArray): Int {

    val stack = Stack<Fish>()
    var numAlive = A.size

    for (i in 0..A.lastIndex){
        var fish = Fish(A[i],B[i])

        if(fish.dir == 1 )
            stack.push(fish)

        else{
            while (!stack.isEmpty()) { // if the downstream fish is bigger (eat the upstream fish)
                if (stack.peek().size > fish.size) {
                    numAlive--
                    break // the upstream fish is eaten (ending)
                } else if (stack.peek().size < fish.size) {
                    numAlive--
                    stack.pop() // the downstream fish is eaten (not ending)
                }
            }
        }
    }

    return numAlive
}

internal class Fish(val size:Int ,val dir:Int){}
