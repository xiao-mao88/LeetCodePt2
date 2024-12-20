/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Runtime: 1 ms, faster than 64.78% of Java online submissions for Longest Common Prefix.
Memory Usage: 42 MB, less than 19.74% of Java online submissions for Longest Common Prefix.
 */
public class N0014LongestCommonPrefix {
  public static String longestCommonPrefix(String[] strs) {
    String result = "";
    boolean stillGoing = true;
    int substringLength = 0;


    while (stillGoing && substringLength <= strs[0].length()) {
      result = strs[0].substring(0, substringLength);
      for (String str : strs) {
        if (!str.startsWith(result)) {
          stillGoing = false;
          result = strs[0].substring(0, substringLength - 1);
          break;
        }
      }
      substringLength ++;
    }

    return result;
  }

  public static void main(String[] args) {
    String[] test1 = {"flower","flow","flight"};
    String[] test2 = {"a"};
    String[] test3 = {"dog","racecar","car"};
    String[] test4 = {"ab","a"};

    System.out.println(longestCommonPrefix(test1));
    System.out.println(longestCommonPrefix(test2));
    System.out.println(longestCommonPrefix(test3));
    System.out.println(longestCommonPrefix(test4));
  }
}
