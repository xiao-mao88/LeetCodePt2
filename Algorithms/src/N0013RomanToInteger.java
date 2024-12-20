/*
For example, 2 is written as II in Roman numeral, just two ones added together.
12 is written as XII, which is simply X + II. The number 27 is written as XXVII,
which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral
for four is not IIII. Instead, the number four is written as IV. Because the one is before the five
we subtract it making four. The same principle applies to the number nine, which is written as IX.
There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.

Runtime: 3 ms, faster than 86.65% of Java online submissions for Roman to Integer.
Memory Usage: 44.4 MB, less than 94.65% of Java online submissions for Roman to Integer.
 */

public class N0013RomanToInteger {

  public static int romanToInt(String s) {
    int result = 0;
    char previous = 'S';
    for (int i = 0; i < s.length(); i++) {
      switch (s.charAt(i)) {
        case 'I':
          result += 1;
        break;
        case 'V':
          result += 5;
        break;
        case 'X':
          result += 10;
        break;
        case 'L':
          result += 50;
        break;
        case 'C':
          result += 100;
        break;
        case 'D':
          result += 500;
        break;
        case 'M':
          result += 1000;
        break;
      }

      if (previous == 'I' && s.charAt(i) == 'V') {
        result += 4;
        result -= 6;
      }

      else if (previous == 'I' && s.charAt(i) == 'X') {
        result += 9;
        result -= 11;
      }

      else if (previous == 'X' && s.charAt(i) == 'L') {
        result += 40;
        result -= 60;
      }

      else if (previous == 'X' && s.charAt(i) == 'C') {
        result += 90;
        result -= 110;
      }

      else if (previous == 'C' && s.charAt(i) == 'D') {
        result += 400;
        result -= 600;
      }

      else if (previous == 'C' && s.charAt(i) == 'M') {
        result += 900;
        result -= 1100;
      }

      previous = s.charAt(i);
    }
    return result;
  }

  public static void main(String[] args) {
    String test1 = "III";
    String test2 = "IV";
    String test3 = "IX";
    String test4 = "LVIII";
    String test5 = "LIV";
    String test6 = "MCMXCIV";

    System.out.println(romanToInt(test1));
    System.out.println(romanToInt(test2));
    System.out.println(romanToInt(test3));
    System.out.println(romanToInt(test4));
    System.out.println(romanToInt(test5));
    System.out.println(romanToInt(test6));
  }
}
