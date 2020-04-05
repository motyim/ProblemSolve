package me.motyim.hackerrank.crackingInterview

fun countSwaps(a: Array<Int>): Unit {

    val n = a.size
    var temp:Int
    var sawp = 0
    for (i in 0 until n) {
        for (j in 0 until n - 1) { // Swap adjacent elements if they are in decreasing order
            if (a[j] < a[j + 1]) {
                temp = a[j]
                a[j]= a[j+1]
                a[j+1] = temp
                sawp++
            }
        }
    }

    print("Array is sorted in $sawp swaps.\nFirst Element: ${a.first()}\nLast Element: ${a.last()}")
}
