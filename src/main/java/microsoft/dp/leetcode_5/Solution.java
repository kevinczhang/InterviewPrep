package microsoft.dp.leetcode_5;

class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() <= 1) return s;
        String res = "";
        for(int i = 0; i < s.length() - 1; i++) {
            String str1  = extendCenter(s, i, i);
            String str2  = "";
            if(s.charAt(i) == s.charAt(i + 1)) {
                str2  = extendCenter(s, i, i + 1);
            }

            if(str1.length() > res.length()){
                res = str1;
            }

            if(str2.length() > res.length()){
                res = str2;
            }
        }
        return res;
    }

    private String extendCenter(String s, int start, int end) {
        while(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
        }
        if (start > end) {
            return "";
        }
        return s.substring(start + 1, end);
    }
}
