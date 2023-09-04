/*
Given a string s, find the length of the longest substring without repeating characters.
This solution is better than V1, not as good as V2
It beat 87.94% of other java online users in speed & 86.11% for memory usage
 */

import java.util.HashMap;
import java.util.Map;

public class N3LongestSubstringWithoutRepeatingCharactersV3 {
    public static int lengthOfLongestSubstring(String s) {
        int ans = 0;
        Map<Character, Integer> map = new HashMap<>();

        for(int left = 0, right = 0; right < s.length(); right++) {
            if(map.containsKey(s.charAt(right)) && map.get(s.charAt(right)) >= left){
                left = map.get(s.charAt(right)) + 1;
                map.put(s.charAt(right), right);
            } else {
                map.put(s.charAt(right), right);
            }

            ans = Math.max(right - left + 1, ans);
        }

        return ans;
    }

    public static void main (String[] args){
        String str1 = "abcabcbb";
        String str2 = "bbbbb";
        String str3 = "pwwkew";
        String str4 = " ";
        String str5 = "au";

        System.out.println(lengthOfLongestSubstring(str1));
        System.out.println(lengthOfLongestSubstring(str2));
        System.out.println(lengthOfLongestSubstring(str3));
        System.out.println(lengthOfLongestSubstring(str4));
        System.out.println(lengthOfLongestSubstring(str5));
    }
}
