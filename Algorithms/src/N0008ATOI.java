/*
The algorithm for myAtoi(string s) is as follows:

1. Whitespace: Ignore any leading whitespace (" ").
2. Signedness: Determine the sign by checking if the next character is '-' or '+', assuming
positivity is neither present.
3. Conversion: Read the integer by skipping leading zeros until a non-digit character is
encountered or the end of the string is reached. If no digits were read, then the result is 0.
4. Rounding: If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then round the
integer to remain in the range. Specifically, integers less than -2^31 should be rounded to -2^31, and
integers greater than 2^31 - 1 should be rounded to 2^31 - 1.

Runtime: 1 ms, faster than 100.00% of Java online submissions for String to Integer (atoi).
Memory Usage: 42.6 MB, less than 22.59% of Java online submissions for String to Integer (atoi).
 */

public class N0008ATOI {
    public static int myAtoi(String s){
        s = s.trim(); // trim takes away any leading whitespace
        // returns 0 if the string is empty after trimming
        if (s.isEmpty()){
            return 0;
        }

        int num = 0, i = 0;
        boolean neg = s.charAt(0) == '-';
        boolean pos = s.charAt(0) == '+';

        if (neg || pos) {
            i++;
        }

        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // checking if integer is in range
            if (num > Integer.MAX_VALUE / 10 || (num == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return neg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            num = num * 10 + digit;
            i++;
        }

        return neg ? -num : num;
    }

    public static void main (String[] args){
        String test1 = "42";
        String test2 = " -042";
        String test3 = "1337c0d3";
        String test4 = "0-1";
        String test5 = "words and 987";
        String test6 = " 4 2";
        String test7 = "-91283472332";
        String test8 = "-9+66";
        String test9 = "-+12";
        String test10 = "";
        String test11 = "+";


        System.out.println(myAtoi(test1));
        System.out.println(myAtoi(test2));
        System.out.println(myAtoi(test3));
        System.out.println(myAtoi(test4));
        System.out.println(myAtoi(test5));
        System.out.println(myAtoi(test6));
        System.out.println(myAtoi(test7));
        System.out.println(myAtoi(test8));
        System.out.println(myAtoi(test9));
        System.out.println(myAtoi(test10));
        System.out.println(myAtoi(test11));
    }
}
