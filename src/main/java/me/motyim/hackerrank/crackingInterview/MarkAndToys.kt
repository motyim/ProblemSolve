package me.motyim.hackerrank.crackingInterview

fun maximumToys(prices: Array<Int>, k: Int): Int {
    var number = 0
    var paied = 0L
    prices.sort();

    for (i in prices){
        if(paied+i < k ){
            paied+=i
            number++
        }else break
    }
    return number

}