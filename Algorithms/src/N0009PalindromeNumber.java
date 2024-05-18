/*
Given an integer x, return true if x is a palindrome, and false otherwise.

Runtime: 8 ms, faster than 13.47% of Java online submissions for Palindrome Number.
Memory Usage: 44.3 MB, less than 17.71% of Java online submissions for Palindrome Number.
 */

public class N0009PalindromeNumber {
    public static boolean isPalindrome(int x){
        String num = Integer.toString(x);

        for(int i=0; i<num.length()/2; i++){
            String f = num.substring(i, i+1);
            String l = num.substring(num.length()-i-1, num.length()-i);
            if (!f.equals(l)){
                return false;
            }
        }

        return true;
    }

    public static void main (String[] args){
        int test1 = -121;
        int test2 = 121;
        int test3 = 114;
        int test4 = 112211;
        int test5 = 112311;

        System.out.println(isPalindrome(test1));
        System.out.println(isPalindrome(test2));
        System.out.println(isPalindrome(test3));
        System.out.println(isPalindrome(test4));
        System.out.println(isPalindrome(test5));
    }
}
