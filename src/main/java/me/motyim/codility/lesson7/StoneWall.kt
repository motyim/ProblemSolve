package me.motyim.codility.lesson7


fun solution(H: IntArray): Int{
    val L: Int = H.size
    var stones = 0
    val wall = IntArray(L)
    var wallNum = 0

    for (i in 0 until L) {
        while (wallNum > 0 && wall[wallNum - 1] > H[i]) wallNum -= 1
        if (wallNum > 0 && wall[wallNum - 1] == H[i]) continue else {
            stones += 1
            wall[wallNum] = H[i]
            wallNum += 1
        }
    }
    return stones
}