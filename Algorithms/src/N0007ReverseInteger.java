/*
Given a signed 32-bit integer x, return x with its digits reversed.
If reversing x causes the value to go outside the signed 32-bit integer range, return 0.

Runtime: 1 ms, faster than 81.61% of Java online submissions for Reverse Integer.
Memory Usage: 40.8 MB, less than 41.14% of Java online submissions for Reverse Integer.
 */

public class N0007ReverseInteger {
    public static int reverse(int x){
        int rev = 0;
        while(x != 0) {

            int digit = x % 10;
            long test = (long)rev * 10 + digit;
            if (test > Integer.MAX_VALUE || test < Integer.MIN_VALUE){
                return 0;
            }

            rev = rev * 10 + digit;

            x /= 10;
        }
        return rev;
    }

    public static void main (String[] args){
        int test1 = 123;
        int test2 = -123;
        int test3 = 120;
        int test4 = 2147483647;

        System.out.println(reverse(test1));
        System.out.println(reverse(test2));
        System.out.println(reverse(test3));
        System.out.println(reverse(test4));
    }
}
