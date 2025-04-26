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
 * Runtime: 1 ms, faster than 63.96% of Java online submissions for Remove Duplicates From Sorted Array.
 * Memory Usage: 44.80 MB, less than 78.98% of Java online submissions for Remove Duplicates From Sorted Array.
 */
public class N0026RemoveDuplicatesFromSortedArrayV3 {
  public static int removeDuplicates(int[] nums) {
    int k = 1;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] != nums[i - 1]) {
        nums[k] = nums[i];
        k++;
      }
    }
    return k;
  }

  public static void main (String[] args) {
    int[] nums = {1, 1, 2, 2, 3, 3, 4};
    System.out.println(removeDuplicates(nums));
    System.err.println(Arrays.toString(nums));
  }
}
