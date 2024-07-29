package me.motyim.leetcode.training.module4

import java.util.*

class kClosest {

    fun kClosest(points: Array<IntArray>, k: Int): Array<IntArray> {

        fun distance(point: IntArray): Int {
            return point[0] * point[0] + point[1] * point[1]
        }

        val pQueue = PriorityQueue<IntArray> { point1, point2 ->
            compareValues(distance(point1), distance(point2))
        }

        points.forEach { pQueue.offer(it) }

        return Array(k){
            pQueue.poll()
        }
    }

}