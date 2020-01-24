package microsoft.string.longestSemiAlternatingSubstring;

public class Solution {
    // Solution 1
    private int findLongestSemiAlteringSubstring(String str) {
        int len = 0;
        if(str == null) return 0;
        if(str.length() < 3) return str.length();
        for(int i=2,j=0;i<str.length(); ++i) {
            if(str.charAt(i) == str.charAt(i-1) && str.charAt(i) == str.charAt(i-2))
                j = i-1;
            len = Math.max(len, i-j+1);
        }
        return len;
    }

    // Solution 2
    private static int getLongest(String s) {
        if(s == null || s.length() == 0)
            return 0;
        if(s.length() < 3)
            return s.length();
        int cnt = 1, l = 0, lastSeen = 0;
        int res = 0;
        for(int r = 1;r < s.length();r++) {
            char c = s.charAt(r);
            if(s.charAt(r-1) == c) {
                cnt++;
            }else {
                cnt = 1;
                lastSeen = r;
            }
            if(cnt > 2 && l < lastSeen)
                l = lastSeen;
            while(cnt > 2) {
                l++;
                cnt--;
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}
