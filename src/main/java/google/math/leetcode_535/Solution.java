package google.math.leetcode_535;

import java.util.HashMap;
import java.util.Map;

/**
 * The hash code for a String object is computed as:
 * 
 * s[0]*31^(n-1) + s[1]*31^(n-2) + … + s[n-1]
 *
 * where :
 *
 * s[i] – is the ith character of the string
 * n – is the length of the string, and
 * ^ – indicates exponentiation
 */
public class Solution {
    Map<Integer, String> map = new HashMap<>();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        map.put(longUrl.hashCode(),longUrl);
        return "http://tinyurl.com/"+longUrl.hashCode();
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(Integer.parseInt(shortUrl.replace("http://tinyurl.com/", "")));
    }
}
