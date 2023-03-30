package me.motyim.leetcode.arrays

class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = hashMapOf<Int,Int>()
        for (i in nums.indices){
            val num = nums[i]
            val diff = target - num
            if (map.containsKey(diff)) return intArrayOf(map[diff]!!,i)
            map[num] = i
        }
        return intArrayOf()
    }
}