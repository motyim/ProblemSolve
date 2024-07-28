package me.motyim.leetcode.training.module4

import java.util.PriorityQueue

class FindKthLargest {

    fun findKthLargest(nums: IntArray, k: Int): Int {
        var idx = k
        val pQueue = PriorityQueue<Int>(compareByDescending { it })
        nums.forEach { pQueue.offer(it) }
        while (idx-- > 1) {
            pQueue.poll()
        }
        return pQueue.poll()
    }

    // with quick select algorithm
    fun findKthLargestEnhanced(nums: IntArray, k: Int): Int {
        val idx = nums.size - k

        fun quickSelect(left: Int, right: Int): Int {
            val pivot = nums[right]
            var p = left
            for(i in left until right){
                if(nums[i]<= pivot){
                    //swap
                    nums[p] = nums[i].also { nums[i] = nums[p] }
                    p++
                }
            }
            nums[p] = nums[right].also { nums[right] = nums[p] }
            return if(p > idx) quickSelect(left,p -1)
            else if(p < idx) quickSelect(p+1 , right)
            else return nums[p]
        }

        return quickSelect(0, nums.size - 1)
    }

}