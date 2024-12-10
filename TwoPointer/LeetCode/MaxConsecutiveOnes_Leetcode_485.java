package dsa_learning.TwoPointer.LeetCode;

public class MaxConsecutiveOnes_Leetcode_485 {

    public static void main(String [] args){
        int [] nums = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {

        int i = 0;
        int count = 0;
        int consecutiveOnes = 0;

        while(i<nums.length){
            if(nums[i]==1){
                count++;
            }
            // update max value of size of subarray of 1s whenever
            // consecutive 1s are not found.
            else{
                consecutiveOnes = Math.max(count, consecutiveOnes);
                count = 0;
            }

            //if iterator reaches the end of the array
            // with last element as 1, then also update max value
            if(i==nums.length-1){
                consecutiveOnes = Math.max(count, consecutiveOnes);
            }
            i++;
        }
        return consecutiveOnes;
    }

}
