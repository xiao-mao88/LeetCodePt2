import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

0 <= a, b, c, d < n
a, b, c, and d are distinct.
nums[a] + nums[b] + nums[c] + nums[d] == target
You may return the answer in any order.

This solution works, but takes too long;; need to find a faster way
 */
public class N0018FourSum {

  public List<List<Integer>> fourSum(int[] nums, int target) {
    Arrays.sort(nums);
    List<List<Integer>> res = new ArrayList<>();
    for (int i = 0; i < nums.length - 3; i++) {
      if (nums[i] > target && target >= 0) {
        break;
      }
      for (int j = i + 1; j < nums.length - 2; j++) {
        if (nums[i] + nums[j] > target && target >= 0) {
          break;
        }
        for (int k = j + 1; k < nums.length - 1; k++) {
          if (nums[i] + nums[j] + nums[k] > target && target >= 0) {
            break;
          }
          for (int l = k + 1; l < nums.length; l++) {
            if (nums[i] + nums[j] + nums[k] + nums[l] > target && target >= 0) {
              break;
            }
            else if (res.contains(Arrays.asList(nums[i], nums[j], nums[k], nums[l]))) {
              break;
            }
            else if (nums[i] + nums[j] + nums[k] + nums[l] == target) {
              res.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
            }
          }
        }
      }
    }
    return res;
  }

  public static void main(String[] args) {
    N0018FourSum fourSum = new N0018FourSum();
    List<List<Integer>> res = fourSum.fourSum(new int[]{1,0,-1,0,-2,2}, 0);
    List<List<Integer>> res2 = fourSum.fourSum(new int[]{2,2,2,2,2}, 8);
    List<List<Integer>> res3 = fourSum.fourSum(new int[]{0,0,0,0,0}, 0);
    System.out.println(res);
    System.out.println(res2);
    System.out.println(res3);
  }
}
