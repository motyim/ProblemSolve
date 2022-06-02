package me.motyim.leetcode;

/**
 * link: <a href="https://leetcode.com/problems/search-in-rotated-sorted-array/">https://leetcode.com/problems/search-in-rotated-sorted-array/</a> <br>
 * <br>resource: <a href="https://www.geeksforgeeks.org/search-an-element-in-a-sorted-and-pivoted-array/">https://www.geeksforgeeks.org/search-an-element-in-a-sorted-and-pivoted-array/</a>
 * <br>resource: <a href="https://www.loom.com/share/62545c207b454657b6635588a939ca63">https://www.loom.com/share/62545c207b454657b6635588a939ca63</a>
 *
 */
public class RotatedSortedArray {

    public int search(int[] nums, int target) {

        if (nums.length == 0) return -1;

        int left = 0;
        int right = nums.length - 1;


        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) return mid;
                // left part
            else if (nums[left] <= nums[mid]) {
                if (target > nums[mid] || target < nums[left])
                    left = mid + 1;
                else right = mid - 1;
            } else {
                if (target < nums[mid] || target > nums[right])
                    right = mid - 1;
                else left = mid + 1;
            }
        }

        return -1;
    }

}
