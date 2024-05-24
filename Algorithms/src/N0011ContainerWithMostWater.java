/*
You are given an integer array height of length n. There are n vertical lines drawn such that the
two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains
the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.

This solution works;; but it is insanely slow and NOT GOOD;; it exceeded the time limit ;-;
Passed 56/62 testcases
 */

public class N0011ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int area = 0;
        int smaller;
        for(int i=0; i<height.length; i++){
            int temp = 1;
            for(int j=i+1; j<height.length; j++){
                smaller = Math.min(height[i], height[j]);
                area = Math.max(smaller*temp, area);
                temp++;
            }
        }
        return area;
    }

    public static void main (String[] args){
        int[] test1 = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(test1));
    }
}
