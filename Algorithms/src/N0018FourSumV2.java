import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Runtime: 19 ms, faster than 35.04% of Java online submissions for 4Sum.
Memory Usage: 44.07 MB, less than 49.81% of Java online submissions for 4Sum.
 */

public class N0018FourSumV2 {
  public List<List<Integer>> fourSum(int[] nums, int target) {
    List<List<Integer>> res = new ArrayList<>();
    if (nums.length < 4) {
      return res;
    }
    Arrays.sort(nums);

    for (int i = 0; i < nums.length - 3; i++) {
      if (i > 0 && nums[i] == nums[i - 1]) {
        continue;
      }
      for (int j = i + 1; j < nums.length - 2; j++) {
        if (j > i + 1 && nums[j] == nums[j - 1]) {
          continue;
        }

        int k = j + 1;
        int l = nums.length - 1;
        while (k < l) {
          long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];
          if (sum == target) {
            res.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
            k++;
            l--;
            while(k<l && nums[k]==nums[k-1])
            {
              k++;
            }
            while(k<l && nums[l]==nums[l+1])
            {
              l--;
            }
          }
          else if (sum < target) {
            k++;
          }
          else {
            l--;
          }
        }
      }
    }
    return res;
  }

  public static void main(String[] args) {
    N0018FourSumV2 fourSum = new N0018FourSumV2();
    List<List<Integer>> res = fourSum.fourSum(new int[]{1,0,-1,0,-2,2}, 0);
    List<List<Integer>> res2 = fourSum.fourSum(new int[]{2,2,2,2,2}, 8);
    List<List<Integer>> res3 = fourSum.fourSum(new int[]{0,0,0,0,0}, 0);
    List<List<Integer>> res4 = fourSum.fourSum(new int[]{-3,-2,-1,0,0,1,2,3}, 0);
    List<List<Integer>> res5 = fourSum.fourSum(new int[]{1000000000,1000000000,1000000000,1000000000}, -294967296);
    System.out.println(res);
    System.out.println(res2);
    System.out.println(res3);
    System.out.println(res4);
    System.out.println(res5);
  }
}
