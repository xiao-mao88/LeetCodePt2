import java.util.Arrays;
/*

Runtime: 1 ms, faster than 64.78% of Java online submissions for Longest Common Prefix.
Memory Usage: 41.3 MB, less than 74.50% of Java online submissions for Longest Common Prefix.

Note: This solution uses a lot less in terms of memory usage, as it only really checks the first
and the last element within this sorted array. Once the array is sorted, this means that the
most common and most uncommon prefix are in the first slot and the last slot of the array.
 */

public class N0014LongestCommonPrefixV2 {
  public static String longestCommonPrefix(String[] strs) {
    StringBuilder result = new StringBuilder();
    Arrays.sort(strs);

    String first = strs[0];
    String last = strs[strs.length - 1];

    for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
      if (first.charAt(i) != last.charAt(i)) {
        return result.toString();
      }
      result.append(first.charAt(i));
    }

    return result.toString();
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
