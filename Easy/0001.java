//Problem 1, Two Sums. Link: https://leetcode.com/problems/two-sum/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++) {
            for(int j = i + 1; j<nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    int [] result = {i,j}; 
                    return result;
                }
            }
            
        }
        int [] fail  = {-1,-1}; 
        return fail;
    }
}