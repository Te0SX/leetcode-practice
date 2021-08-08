// 0220. Contains Duplicate III

class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
    	boolean bool;
        for(int i=0; i < nums.length; i++) {
        	for (ing j=i+1; j < nums.length; j++ ) {
        		bool = (Math.abs(nums[i]-nums[j]) <= t && Math.abs(nums[i]-nums[j]) <= k) ? true : false;
        	}
        }
        return bool;
    }
}