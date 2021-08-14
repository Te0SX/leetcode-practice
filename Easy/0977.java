// 0977. Squares of a Sorted Array

class Solution {
    public int[] sortedSquares(int[] A) {
 		int[] result = new int[A.length];
 		int left = 0, right = A.length - 1;

 		for (int p = A.length - 1; p >= 0; p--) {
 			if(Math.abs(A[left]) > Math.abs(A[right])) {
 				result[p] = A[left] * A[left];
 				left++;
 			} else {
 				result[p] = A[right] * A[right];
 				right--;
 			}
 		} 
 		return result;
    }
}