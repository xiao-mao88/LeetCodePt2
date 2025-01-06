import java.util.ArrayList;
import java.util.List;
/*
Given a string containing digits from 2-9 inclusive, return all possible letter combinations that
the number could represent. Return the answer in any order.

A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1
does not map to any letters.

Runtime: 0 ms, faster than 100.00% of Java online submissions for 3Sum Closest.
Memory Usage: 41.95 MB, less than 79.76 of Java online submissions for 3Sum Closest.
 */

public class N0017LettersComboOfPhoneNumber {
  private static final String[] phone = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
  public static List<String> letterCombinations(String digits) {
    List<String> res = new ArrayList<>();

    if (digits.isEmpty()) {
      return res;
    }

    backtrack(0, digits, new StringBuilder(), res);

    return res;
  }

  private static void backtrack(int index, String digits, StringBuilder path, List<String> combinations) {
    if (index == digits.length()) {
      combinations.add(path.toString());
      return;
    }

    String possibleLetters = phone[digits.charAt(index) - '0'];
    for (char letter : possibleLetters.toCharArray()) {
      path.append(letter);
      backtrack(index + 1, digits, path, combinations);
      path.deleteCharAt(path.length() - 1); // Backtrack
    }
  }

  public static void main(String[] args) {
    List<String> res = letterCombinations("23");
    System.out.println(res);
  }
}
