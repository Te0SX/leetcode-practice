// 0022. Generate Parentheses

class Solution {
    public List<String> generateParenthesis(int n) {
     List<String> res = new ArrayList<>();
     helper(res, new StringBuilder(), 0, 0, n);
     return res;
}

    private void helper(List<String> res, StringBuilder sb, int open, int close, int n) {
        if(open == n && close == n) {
            res.add(sb.toString());
            return;
        }

        if(open < n) {
            sb.append("(");
            helper(res, sb, open+1, close, n);
            sb.setLength(sb.length()-1);
        } 
        if(close < open) {
            sb.append(")");
            helper(res, sb, open, close+1, n);
            sb.setLength(sb.length()-1);
        }
    }
}


// Check backtrack algorythm for the below solution!

// public List<String> generateParenthesis(int n) {
//         List<String> list = new ArrayList<String>();
//         backtrack(list, "", 0, 0, n);
//         return list;
//     }
    
//     public void backtrack(List<String> list, String str, int open, int close, int max){
        
//         if(str.length() == max*2){
//             list.add(str);
//             return;
//         }
        
//         if(open < max)
//             backtrack(list, str+"(", open+1, close, max);
//         if(close < open)
//             backtrack(list, str+")", open, close+1, max);
//     }