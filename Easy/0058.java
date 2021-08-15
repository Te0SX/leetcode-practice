// 0058. Length of Last Word

class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
		
        for (int i = s.length() - 1; i >= 0; i--) {	//start from the end since we look for the last word
            if (s.charAt(i) != ' ') { // a letter is found so count
                length++;
            } else {  // if it's space
                if (length > 0) return length;
            }
        }
        return length;
    }
}