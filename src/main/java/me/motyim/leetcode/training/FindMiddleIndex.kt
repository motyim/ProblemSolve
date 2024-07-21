package me.motyim.leetcode.training

class FindMiddleIndex {

    fun findMiddleIndex(nums: IntArray): Int {
        val total = nums.sum()
        var left = 0
        var right: Int

        for ((index, num) in nums.withIndex()) {
            right = total - (left + num)
            if (left == right) return index
            left += num
        }

        return -1
    }
}