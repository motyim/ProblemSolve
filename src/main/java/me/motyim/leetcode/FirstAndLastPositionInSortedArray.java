package me.motyim.leetcode;

/**
 * link : <a href="https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/">Problem</a>
 */
public class FirstAndLastPositionInSortedArray {

    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[]{-1, -1};

        //edge case
        if (nums.length == 0 || target < nums[0] || target > nums[nums.length - 1]) return ans;

        modifiedBinarySearch(nums,target,ans,0);
        modifiedBinarySearch(nums,target,ans,1);

        return ans;
    }

    private void modifiedBinarySearch(int[] nums, int target, int[] ans, int ansIdx) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (target > nums[mid]) left = mid + 1;
            else if (target < nums[mid]) right = mid - 1;
                // we found the element
            else {
                ans[ansIdx] = mid;
                if (ansIdx == 0) right = mid - 1;
                else left = mid + 1;
            }
        }


    }

}
