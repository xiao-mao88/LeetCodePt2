import java.util.ArrayList;
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
 * Runtime: 2 ms, faster than 11.68% of Java online submissions for Remove Duplicates From Sorted Array.
 * Memory Usage: 44.66 MB, less than 90.30% of Java online submissions for Remove Duplicates From Sorted Array.
 */
public class N0026RemoveDuplicatesFromSortedArrayV2 {
  public static int removeDuplicates(int[] nums) {
    int curr = 101;
    ArrayList<Integer> list = new ArrayList<>();
    for (int num : nums) {
      if (num != curr) {
        list.add(num);
        curr = num;
      }
    }
    int[] result = new int[list.size()];
    Arrays.setAll(result, list::get);
    System.arraycopy(result, 0, nums, 0, list.size());
    return list.size();
  }

  public static void main (String[] args) {
    int[] nums = {1, 1, 2};
    System.out.println(removeDuplicates(nums));
    System.err.println(Arrays.toString(nums));
  }
}
