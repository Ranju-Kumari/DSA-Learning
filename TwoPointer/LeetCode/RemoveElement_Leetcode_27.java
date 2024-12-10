package dsa_learning.TwoPointer.LeetCode;

import java.util.Arrays;

public class RemoveElement_Leetcode_27 {

    public static void main(String[] args){

        int [] nums = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(nums));
    }

    public static int removeElement(int[] nums) {
        int k=0;
        Arrays.sort(nums);
        for(int i=1;i<=nums.length-1;i++){
            if(nums[k]!=nums[i]){
                k++;
                nums[k]=nums[i];
            }
        }

        for(int j=0;j<=k;j++){
            System.out.print(" "+nums[j]+"\n");
        }
        return k+1;
    }
}
