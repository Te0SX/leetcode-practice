// 0977. Squares of a Sorted Array

class Solution {
    public int[] sortedSquares(int[] A) {
 		int[] result = new int[A.length];
 		int i = 0, j = A.length - 1;

 		for (int p = A.length - 1; p >= 0; p--) {
 			if(Math.abs(A[i]) > Math.abs(A[j])) {
 				result[p] = A[i] * A[i];
 				i++;
 			} else {
 				result[p] = A[j] * A[j];
 				j--;
 			}
 		} 
 		return result;
    }
}