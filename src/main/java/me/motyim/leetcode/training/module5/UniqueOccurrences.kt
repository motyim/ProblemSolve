package me.motyim.leetcode.training.module5

class UniqueOccurrences {

    fun uniqueOccurrences(arr: IntArray): Boolean {
        val map = HashMap<Int,Int>()

        arr.forEach { value -> map[value] = 1 + (map[value] ?: 1) }

        return map.keys.size == map.values.toSet().size
    }
}