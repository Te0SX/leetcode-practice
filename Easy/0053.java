// 0053. Maximum Subarray

// for explanation of Kadane's algorithm for Java check
// https://java2blog.com/kadane-algorithm-in-java/

// it works with all negative numbers as well
class Solution {
    public int maxSubArray(int[] nums) {
 		int maxEndHere = nums[0];
		int maxSoFar = nums[0];

		for(int i=1; i<nums.length; i++) {
			maxEndHere = (nums[i] > maxEndHere + nums[i]) ? nums[i] : maxEndHere + nums[i];
			maxSoFar = (maxSoFar > maxEndHere) ? maxSoFar : maxEndHere;
		}
		return maxSoFar;
    }
}