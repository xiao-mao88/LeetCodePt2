/*
Given a string s, find the length of the longest substring without repeating characters.
This is a better solution; it beat 99.71% of other java online users in speed & 99.06% for memory usage
 */

public class N0003LongestSubstringWithoutRepeatingCharactersV2 {
    public static int lengthOfLongestSubstring(String s) {
        int length = 0;

        for(int right = 0, left = 0; right < s.length(); right++) {
            int index = s.indexOf(s.charAt(right), left);
            if(index != right){
                left = index + 1;
            }
            length = Math.max(length, right - left + 1);
        }

        return length;
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
