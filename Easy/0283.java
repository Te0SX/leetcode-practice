// 0283 - Move Zeroes - https://leetcode.com/problems/move-zeroes/

class Solution {
    public void moveZeroes(int[] nums) {
        if(nums == null || nums.length == 0) return;
        int k = 0;
        for(int i=0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[k++] = nums[i];
            }
        }
        for(int n=1; n < k; n++) {
            nums[nums.length-n] = 0;
        }
    }
}