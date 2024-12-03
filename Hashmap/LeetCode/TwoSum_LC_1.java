package LeetCode;

import java.util.HashMap;

public class TwoSum_LC_1 {

    public static void main(String[] args){

        int [] nums = {3,2,4};
        int target = 6;
        int [] twoSumIndices = twoSum_ArrayIsNotsorted(nums,target);

        for(int i : twoSumIndices){
            System.out.print(i+" ");
        }
    }

    // If the given array is not sorted, we can use hashtable
    public static int[] twoSum_ArrayIsNotsorted(int [] nums, int target){
        int [] twoSum = new int[2];

        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i=0;i<=nums.length-1;i++){
            if(mp.containsKey(target-nums[i])){
                twoSum[0]=mp.get(target-nums[i]);
                twoSum[1]=i;
            }
            mp.put(nums[i],i);

        }
        return twoSum;
    }



    // Better approach: O(n*logn)   ----> If the given array is sorted
    public static int [] twoSum(int [] nums, int target){

        int minValIndex =0;
        int maxValIndex = nums.length-1;
        int arrLength = nums.length;
        int [] twoSumIndices = new int[2];

        while(arrLength-->0){
            if(nums[minValIndex]+nums[maxValIndex]==target){
                twoSumIndices[0]=minValIndex;
                twoSumIndices[1]=maxValIndex;

            } else if (nums[minValIndex]+nums[maxValIndex]>target) {
                maxValIndex--;
            }else {
                minValIndex++;
            }
        }
        return twoSumIndices;
    }

    //Brute force approach : O(n*n)
    public static int [] twoSum_BruteForce(int [] nums, int target){

        int [] twoSumIndices = new int[2];
        for(int i=0;i<=nums.length-1;i++){
            for(int j=i+1;j<=nums.length-1;j++){
                if(nums[i]+nums[j]==target){
                    twoSumIndices[0]=i;
                    twoSumIndices[1]=j;
                }
            }
        }
        return twoSumIndices;
    }
}
