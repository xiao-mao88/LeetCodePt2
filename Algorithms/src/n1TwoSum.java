import java.util.Arrays;
/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
 */


public class n1TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int first = 0;
        int second = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j] == target){
                    first = i;
                    second = j;
                    i = nums.length+1;
                    j = nums.length+1;
                }
            }
        }

        int[] arr = {first, second};
        return arr;
    }
    public static void main (String args[]){
        int[] num1 = {2,7,11,15};
        int target1 = 9;

        int[] num2 = {3,2,4};
        int target2 = 6;

        int[] num3 = {3,3};
        int target3 = 6;

        int[] num4 = {3, 2, 3};
        int target4 = 6;

        System.out.println(Arrays.toString(twoSum(num1, target1)));
        System.out.println(Arrays.toString(twoSum(num2, target2)));
        System.out.println(Arrays.toString(twoSum(num3, target3)));
        System.out.println(Arrays.toString(twoSum(num4, target4)));
    }
}
