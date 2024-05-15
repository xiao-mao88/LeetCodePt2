/*
Given a string s, return the longest palindromic substring in s.
This is the best solution I found
It beat 99.39% of other java online users in speed & 95.96% for memory usage
This code essentially starts from a "center" and checks from in to out whether the string is a palindrome
In this way, it is faster than my other solution, as the other solution has to iterate redundant strings
multiple times
 */

public class N0005LongestPalidromicSubstringV2 {
    int start = 0; // Initialize the start index for the longest palindrome.
    int max = 0;   // Initialize the length of the longest palindrome.

    public String longestPalindrome(String s) {
        if(s.length() < 2)
            return s;

        char[] chars = s.toCharArray();

        for(int i = 0; i < chars.length; i++){
            // Find odd length palindrome
            findPalindrome(chars, i, i); // current character as the center of the palindrome

            // Find even length palindrome
            findPalindrome(chars, i, i+1); // current character and the next character as the centers of the palindrome.
        }

        // Return the longest palindromic substring by using the start and max indices.
        return s.substring(start, start + max);
    }

    private void findPalindrome(char[] chars, int j, int k){
        // Expand the palindrome by checking characters at indices j and k.
        while( j >= 0 && k < chars.length && chars[j] == chars[k]){
            j--;
            k++;
        }

        // Check if the current palindrome length is greater than the previously recorded maximum.
        if(max < k - j - 1){
            max = k - j - 1;   // Update the length of the longest palindrome.
            start = j + 1;     // Update the start index of the longest palindrome.
        }
    }
}
