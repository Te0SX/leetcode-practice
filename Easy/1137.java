// 1137 N-th Thibonacci Number

class Solution {
    public int tribonacci(int n) {
 		if (n<=1) return n;

 		int[] tn = new int[n+1];
 		tn[1] = 1;
 		tn[2] = 1;       
 		for(int i=3; i <= n; i++) {
 			tn[i] = tn[i-1] + tn[i-2] + tn[i-3];
 		}
 		return tn[n];
    }
}