// 0217 - Contain Duplicate

// Time limit exceeded
class Solution {
    public boolean containsDuplicate(int[] nums) {
		boolean bool = false;
        for(int i=0; i < nums.length; i++) {
        	for (int j=i+1; j < nums.length; j++ ) {
        		bool = (Math.abs(nums[i]-nums[j]) == 0) ? true : false;
                if(bool == true) break;
        	}
            if(bool == true) break;
        }
        return bool;        
    }
}

// Accepted, 3ms and 41.8MB
class Solution {
  public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }
}

// Accepted, 6ms and 45.2MB
class Solution {
	public boolean containsDuplicate(int[] nums) {

	    final Set<Integer> distinct = new HashSet<Integer>();
	    for(int num : nums) {
	        if(distinct.contains(num)) {
	            return true;
	        }
	        distinct.add(num);
	    }
	    return false;
	}
}

// Accepted, 7ms and 46.5MB
class Solution {
	public boolean containsDuplicate(int[] nums) {

	        return nums.length != Arrays.stream(nums)
	                .distinct()
	                .count();
	}
}