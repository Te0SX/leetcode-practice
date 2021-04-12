//Problem 9, Palindrome Number. Link: https://leetcode.com/problems/palindrome-number/

class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0, original = x, lastdigit =0;
        while (x >= 1) {
            lastdigit = x % 10;
            x /= 10;
            rev = rev*10 + lastdigit;
        }
        return original == rev;
    }
}