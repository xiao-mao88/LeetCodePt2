import java.util.Arrays;
/**
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such
 * that each unique element appears only once. The relative order of the elements should be kept
 * the same. Then return the number of unique elements in nums.
 *
 * Consider the number of unique elements of nums to be k, to get accepted, you need to do the
 * following things:
 * Change the array nums such that the first k elements of nums contain the unique elements in the
 * order they were present in nums initially. The remaining elements of nums are not important as
 * well as the size of nums.
 * Return k.
 *
 * Runtime: 6 ms, faster than 6.01% of Java online submissions for Remove Duplicates From Sorted Array.
 * Memory Usage: 45.35 MB, less than 6.72% of Java online submissions for Remove Duplicates From Sorted Array.
 */
public class N0026RemoveDuplicatesFromSortedArray {
  public static int removeDuplicates(int[] nums) {
    int curr = 101;
    int k = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == curr) {
        nums[i] = 101;
      }
      else {
        curr = nums[i];
        k++;
      }
    }
    Arrays.sort(nums);
    return k;
  }

  public static void main (String[] args) {
    int[] nums = {1, 1, 2};
    System.out.println(removeDuplicates(nums));
    System.err.println(Arrays.toString(nums));
  }
}
