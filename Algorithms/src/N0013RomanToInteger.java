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
