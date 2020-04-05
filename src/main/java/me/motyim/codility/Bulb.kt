package me.motyim.codility

fun bulb(A:IntArray):Int{
    val B = IntArray(A.size)
    var light = 0
    for(i in A){
        B[i-1] = 1
         var flag = true
        for(j in i-1 downTo  0 ){
            if(B[j]==0) {
                flag = false
                break
            }
        }
        if (flag) light++
    }

    return light
}