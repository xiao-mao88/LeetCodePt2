/*
You are given an integer array height of length n. There are n vertical lines drawn such that the
two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains
the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.

Runtime: 5 ms, faster than 68.92% of Java online submissions for Container With Most Water.
Memory Usage: 57.6 MB, less than 61.82% of Java online submissions for Container With Most Water.

Note: this solution differs in my previous one in the fact that rather than traversing the
entire array n^2 amount of times, it is only done n times;; much faster and better
 */

public class N0011ContainerWithMostWaterV2 {
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int area = 0;

        while (left < right) {
            int currArea = Math.min(height[left], height[right]) * (right - left);
            area = Math.max(area, currArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return area;
    }

    public static void main (String[] args){
        int[] test1 = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(test1));
    }
}
