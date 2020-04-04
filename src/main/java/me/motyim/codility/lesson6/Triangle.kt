package me.motyim.codility.lesson6

fun triangle(A: IntArray): Int {
    val isTriangle:(Int,Int,Int)->Boolean = {a,b,c->
        val aa = a.toLong()
        val bb = b.toLong()
        val cc = c.toLong()
        aa+bb > cc && aa+cc > bb && bb+cc > aa
    }
    val B = A.filter { it>0 }.sorted()
    for (i in 0..B.lastIndex-2){
        if(isTriangle(B[i],B[i+1],B[i+2]))
            return 1
    }
    return 0
}