//Given two sorted arrays nums1 and nums2 of size m and n respectively,
// return the median of the two sorted arrays.
import java.util.Arrays;

public class N4MedianOfTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length+nums2.length;
        int[] arr = new int[length];
        for(int i=0; i<nums1.length; i++){
            arr[i] = nums1[i];
        }
        for(int j=nums1.length, k=0; j<arr.length; j++, k++){
            arr[j] = nums2[k];
        }
        Arrays.sort(arr);
        if (length%2 != 0){
            return (double) arr[length/2];
        }
        return (double)(arr[(length-1)/2] + arr[length/2])/2.0;
    }

    public static void main (String[] args){
        int[] test1num1 = {1,3};
        int[] test1num2 = {2};

        int[] test2num1 = {1,2};
        int[] test2num2 = {3,4};

        int[] test3num1 = {5,7};
        int[] test3num2 = {5,6};

        int[] test4num1 = {5,7};
        int[] test4num2 = {5};

        System.out.println(findMedianSortedArrays(test1num1, test1num2));
        System.out.println(findMedianSortedArrays(test2num1, test2num2));
        System.out.println(findMedianSortedArrays(test3num1, test3num2));
        System.out.println(findMedianSortedArrays(test4num1, test4num2));
    }
}
