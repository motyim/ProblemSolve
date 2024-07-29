package me.motyim.leetcode.training.module5

import kotlin.math.absoluteValue

class ContainsNearbyDuplicate {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        val map = HashMap<Int, Int>()
        nums.forEachIndexed { index, num ->
            val value = map[num]
            if (value != null && (value - index).absoluteValue <= k) {
                return true
            }
            map[num]= index
        }
        return false
    }

    fun containsNearbyDuplicate2(nums: IntArray, k: Int): Boolean {
        val set = HashSet<Int>()
        nums.forEachIndexed { index, num ->
            if(set.contains(num)) return true
            set.add(num)
            if(set.size> k) set.remove(nums[index-k])
        }
        return false
    }
}