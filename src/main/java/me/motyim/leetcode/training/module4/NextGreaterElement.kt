package me.motyim.leetcode.training.module4

import java.util.LinkedList

class NextGreaterElement {

    fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {

        val map = nums1.mapIndexed { index, value -> value to index }.toMap()
        val solution = IntArray(nums1.size) { -1 }

        val stack = LinkedList<Int>()
        for (number in nums2) {
            while (stack.isNotEmpty() && number > stack.peek()) {
                val key = stack.pop()
                val idx = map[key]
                solution[idx!!] = number
            }

            if (map.containsKey(number)) {
                stack.push(number)
            }
        }

        return solution
    }

}