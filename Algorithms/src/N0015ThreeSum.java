import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such
that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

Runtime: 30 ms, faster than 67.07% of Java online submissions for 3Sum.
Memory Usage: 52 MB, less than 33.11% of Java online submissions for 3Sum.

Note: This solution utilizes two pointers, which are j and k. The array is first sorted and
then iterated through. Duplicate elements are skipped because of the way this function works.
 */

public class N0015ThreeSum {

  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> res = new ArrayList<>();
    Arrays.sort(nums);

    for (int i = 0; i < nums.length - 2; i++) {
      if (i > 0 && nums[i] == nums[i - 1]) {
        continue;
      }

      int j = i + 1;
      int k = nums.length - 1;

      while (j < k) {
        int sum = nums[i] + nums[j] + nums[k];
        if (sum == 0) {
          res.add(Arrays.asList(nums[i], nums[j], nums[k]));
          while (j < k && nums[j] == nums[j + 1]) {
            j++;
          }
          while (k > j && nums[k] == nums[k - 1]) {
            k--;
          }

          j++;
          k--;
        }

        else if (sum < 0) {
          j++;
        }

        else {
          k--;
        }
      }
    }

    return res;
  }

  public static void main(String[] args) {
    int[] test1 = {-1, 0, 1, 2, -1, -4};
    int[] test2 = {0, -1, 0, 1, 2, -1, -4};
    int[] test3 = {0, 0, 1};
    int[] test4 = {0, 0, 0};

    System.out.println(new N0015ThreeSum().threeSum(test1));
    System.out.println(new N0015ThreeSum().threeSum(test2));
    System.out.println(new N0015ThreeSum().threeSum(test3));
    System.out.println(new N0015ThreeSum().threeSum(test4));
  }
}
