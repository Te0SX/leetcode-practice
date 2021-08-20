// 0509. Fibonacci Number

class Solution {
    public int fib(int n) {
 		if(n <= 2) return n;

 		int[] fn = new int[n+1];
 		fn[1] = 1;
 		fn[2] = 2;
 		for (int i=3; i <= n; i++) {
 			fn[i] = fn[i-1] + fn[i-2];
 		}
 		return fn[n];
    }
}