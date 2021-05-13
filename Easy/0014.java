//Problem 14, Longest Common Prefix

class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        StringBuilder solution = new StringBuilder();

        if(strs != null && strs.length >0) {

        	Arrays.sort(strs);

        	char [] c1 = strs[0].toCharArray();
        	char [] c2 = strs[strs.length - 1].toCharArray();

        	for (int i=0; i < c1.length; i++) {
        		if (c2.length > i && c2[i] == c1[i]) {
        			solution.append(c2[i]); 
        		} 
        		else {
        			return solution.toString();	
        		}
        	}
        }
        return solution.toString();
    }
}