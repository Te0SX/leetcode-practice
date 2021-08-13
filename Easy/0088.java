// 0088. Merge Sorted Array

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m -1;
        int j = n - 1;
        int f = m + n - 1;
        while (i >= 0 && j >= 0) {
        	nums1[f--] = (nums1[i] > nums2[j]) ? nums1[i--] : nums2[j--];
        }
        
        while ( j >= 0) nums1[f--] = nums2[j--]; //
    }
}