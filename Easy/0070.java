// 0070. Climbing stairs

// Fibonacci number problem: https://en.wikipedia.org/wiki/Fibonacci_number
class Solution {
    public int climbStairs(int n) {
 		if (n <= 2) {
 			return n;
 		}

 		int[] dp = new int[n+1];
 		dp[1] = 1;
 		dp[2] = 2;
 		for(int i=0; i <= n; i++) {
 			dp[i] = dp[i-1] + dp[i-2]; //Fibonacci
 		}
 		return dp[n];
    }
}