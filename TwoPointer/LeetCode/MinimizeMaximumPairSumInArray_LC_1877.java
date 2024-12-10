package dsa_learning.TwoPointer.LeetCode;

import java.util.Arrays;

public class MinimizeMaximumPairSumInArray_LC_1877 {

    public static void main(String []args){
        int [] nums = {3,5,2,3};
        System.out.println(minPairSum(nums));
    }

    public static int minPairSum(int[] nums){
        int [] sum = new int[nums.length/2];
        int j=0;
        int max=0;

        // Firstly, sorted the array
        Arrays.sort(nums);

        // The finding the sum of the current minimum element and current maximum
        // element of the array
        for(int i=0;i<=(nums.length/2)-1;i++){
            sum[j] = nums[i]+nums[nums.length-1-i];
            j++;
        }

        //Lastly, finding the maximum element from the pair sum array.
        for(int i =0;i<=sum.length-1;i++){
            if(sum[i]>max){
                max=sum[i];
            }
        }
        return max;
    }

}
