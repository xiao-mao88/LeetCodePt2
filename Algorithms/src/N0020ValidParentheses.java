import java.util.ArrayList;
/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
determine if the input string is valid.

An input string is valid if:

1. Open brackets must be closed by the same type of brackets.
2. Open brackets must be closed in the correct order.
3. Every close bracket has a corresponding open bracket of the same type.

Runtime: 3 ms, faster than 41.94% of Java online submissions for Valid Parentheses.
Memory Usage: 41.74 MB, less than 65.83% of Java online submissions for Valid Parentheses.
 */

public class N0020ValidParentheses {
  public boolean isValid(String s) {
    ArrayList<Character> openBrackets = new ArrayList<>();

    for (int i = 0; i < s.length(); i++) {
      int numOpenBrackets = openBrackets.size();
      if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
        openBrackets.add(s.charAt(i));
      }

      switch (s.charAt(i)) {
        case ')':
          if (openBrackets.isEmpty() || !openBrackets.get(numOpenBrackets - 1).equals('(')) {
            return false;
          }
          openBrackets.remove(numOpenBrackets - 1);
        break;
        case '}':
          if (openBrackets.isEmpty() || !openBrackets.get(numOpenBrackets - 1).equals('{')) {
            return false;
          }
          openBrackets.remove(numOpenBrackets - 1);
        break;
        case ']':
          if (openBrackets.isEmpty() || !openBrackets.get(numOpenBrackets - 1).equals('[')) {
            return false;
          }
          openBrackets.remove(numOpenBrackets - 1);
        break;
      }
    }

    return openBrackets.isEmpty();
  }

  public static void main(String[] args) {
    String s1 = "(kjkhjgklhgk)";
    String s2 = "()[]{}";
    String s3 = "()[]}";
    String s4 = "([])";
    String s5 = "(";

    System.out.println(new N0020ValidParentheses().isValid(s1));
    System.out.println(new N0020ValidParentheses().isValid(s2));
    System.out.println(new N0020ValidParentheses().isValid(s3));
    System.out.println(new N0020ValidParentheses().isValid(s4));
    System.out.println(new N0020ValidParentheses().isValid(s5));
  }
}
