/**
 * Given two strings needle and haystack, return the index of the first occurrence of needle in
 * haystack, or -1 if needle is not part of haystack.
 *
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Find Index of First Occurrence in a String.
 * Memory Usage: 44.80 MB, less than 78.98% of Java online submissions for Find Index of First Occurrence in a String.
 *
 * Note: This could be "cheating", but it gets the job done. Maybe I will do another way later.
 */

public class N0028FindIndexOfFirstOccurrenceInAString {
  public static int strStr(String haystack, String needle) {
    return haystack.indexOf(needle);
  }

  public static void main(String[] args) {
    String haystack1 = "sadbutsad";
    String needle1 = "sad";
    String haystack2 = "leetcode";
    String needle2 = "leeto";

    System.out.println(strStr(haystack1, needle1));
    System.out.println(strStr(haystack2, needle2));
  }
}
