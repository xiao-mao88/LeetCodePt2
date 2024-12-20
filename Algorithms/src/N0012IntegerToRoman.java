/*
Roman numerals are formed by appending the conversions of decimal place values from highest to
lowest. Converting a decimal place value into a Roman numeral has the following rules:

If the value does not start with 4 or 9, select the symbol of the maximal value that can be
subtracted from the input, append that symbol to the result, subtract its value, and convert the
remainder to a Roman numeral.

If the value starts with 4 or 9 use the subtractive form representing one symbol subtracted from
the following symbol, for example, 4 is 1 (I) less than 5 (V): IV and 9 is 1 (I) less than 10
(X): IX. Only the following subtractive forms are used: 4 (IV), 9 (IX), 40 (XL), 90 (XC), 400
(CD) and 900 (CM).
Only powers of 10 (I, X, C, M) can be appended consecutively at most 3 times to represent
multiples of 10. You cannot append 5 (V), 50 (L), or 500 (D) multiple times. If you need to append
a symbol 4 times use the subtractive form.

Given an integer, convert it to a Roman numeral.

Runtime: 11 ms, faster than 11.98% of Java online submissions for Integer to Roman.
Memory Usage: 45.2 MB, less than 7.57% of Java online submissions for Integer to Roman.

Note: this solution is not that good, and there are definitely better solutions to this problem
 */

public class N0012IntegerToRoman {
  public static String romanNum(int num) {
    String[] ones = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
    String[] tens = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
    String[] hrns = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
    String[] ths ={"","M","MM","MMM"};

    return String.valueOf(ths[num / 1000]) +
            hrns[(num % 1000) / 100] +
            tens[(num % 100) / 10] +
            ones[num % 10];
  }

  public static void main (String[] args) {
    int test1 = 3749;
    int test2 = 58;
    int test3 = 1994;

    System.out.println(romanNum(test1));
    System.out.println(romanNum(test2));
    System.out.println(romanNum(test3));
  }
    
}