import java.util.Arrays;
/*
Given an integer array nums of length n and an integer target, find three integers in nums such
that the sum is closest to target.

Return the sum of the three integers.

You may assume that each input would have exactly one solution.

Runtime: 14 ms, faster than 79.03% of Java online submissions for 3Sum Closest.
Memory Usage: 43.5 MB, less than 16.68% of Java online submissions for 3Sum Closest.
 */

public class N0016ThreeSumClosest {
  public static int threeSumClosest(int[] nums, int target) {
    Arrays.sort(nums);
    int closest = nums[0] + nums[1] + nums[2];

    for (int i = 0; i < nums.length - 2; i++) {
      if (i > 0 && nums[i] == nums[i - 1]) {
        continue;
      }

      int j = i + 1;
      int k = nums.length - 1;
      while (j < k) {
        int tempSum = nums[i] + nums[j] + nums[k];
        if (tempSum == target) {
          return target;
        }

        if (Math.abs(target - tempSum) < Math.abs(closest - target)) {
          closest = tempSum;
        }

        else if (tempSum < target) {
          j++;
        }

        else {
          k--;
        }
      }
    }
    return closest;
  }

  public static void main(String[] args) {
    int[] nums1 = {-1, 2, 1, -4};
    int target1 = 1;
    int[] nums2 = {0, 0, 0};
    int target2 = 2;
    int[] nums3 = {1, -1 , 1};
    int target3 = 1;
    int[] nums4 = {0, 1, 1, 1};
    int target4 = 100;
    int[] nums5 = {2, 3, 8, 9, 10};
    int target5 = 16;

    System.out.println(threeSumClosest(nums1, target1));
    System.out.println(threeSumClosest(nums2, target2));
    System.out.println(threeSumClosest(nums3, target3));
    System.out.println(threeSumClosest(nums4, target4));
    System.out.println(threeSumClosest(nums5, target5));
  }
}
