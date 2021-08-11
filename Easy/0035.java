// 0035, Search Insert Position

// Binary Search O(logN)
class Solution {
	public int searchInsert(int[] nums, int target) {
		if (nums.length == 0) return -1;

		int low = 0;
		int high = nums.length -1;

		while (low <= high) {
			int mid = (low + high) / 2;
			int guess = nums[mid];

			if(guess == target) {
				return mid;
			} else if (guess > target) {
				high = mid - 1;
			} else if (guess < target) {
				low = mid + 1;
			}
		}
		return low;
	}
}


// Slow mode O(n)
// class Solution {
//     public int searchInsert(int[] nums, int target) {
//         if(target < nums[0]) return 0;
//         if(target > nums[nums.length-1]) return nums.length;
//         for(int i=0; i < nums.length; i++) {
//             if(target == nums[i]) return i;
//             if(target > nums[i] && target < nums[i+1]) return i+1;
//         }
//         return -1;
//     }
// }