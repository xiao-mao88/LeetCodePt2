import java.util.Arrays;
/**
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
 * The order of the elements may be changed. Then return the number of elements in nums which
 * are not equal to val.
 *
 * Consider the number of elements in nums which are not equal to val be k, to get accepted,
 * you need to do the following things:
 * Change the array nums such that the first k elements of nums contain the elements which are not
 * equal to val. The remaining elements of nums are not important as well as the size of nums.
 * Return k.
 *
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Element.
 * Memory Usage: 42.24 MB, less than 17.27% of Java online submissions for Remove Element.
 */
public class N0027RemoveElement {
  public static int removeElement(int[] nums, int val) {
    int k = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != val) {
        nums[k] = nums[i];
        k++;
      }
    }
    return k;
  }

  public static void main (String[] args) {
    int[] nums = {1, 1, 2, 2, 3, 3, 4};
    System.out.println(removeElement(nums, 1));
    System.err.println(Arrays.toString(nums));
  }
}
