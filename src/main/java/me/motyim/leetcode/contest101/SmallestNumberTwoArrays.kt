package me.motyim.leetcode.contest101

class SmallestNumberTwoArrays {
    fun minNumber(nums1: IntArray, nums2: IntArray): Int {
        val set1 = nums1.toSortedSet()
        val set2 = nums2.toSortedSet()
        for (number in set1){
            if(set2.contains(number)) return number
        }
        val number1 = set1.first()
        val number2 = set2.first()

        return if(number1 <= number2) "$number1$number2".toInt() else "$number2$number1".toInt()
    }
}