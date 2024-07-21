package me.motyim.leetcode.training

import kotlin.math.max

class MaxProfit {

    fun maxProfit(prices: IntArray): Int {
        var left = 0
        var right = 1
        var maxProfit = 0

        while (right < prices.size) {
            if (prices[right] >= prices[left]) {
                maxProfit = max(prices[right] - prices[left], maxProfit)
            } else {
                left = right
            }
            right++
        }
        return maxProfit
    }

}