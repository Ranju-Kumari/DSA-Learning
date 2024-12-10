package dsa_learning.TwoPointer.LeetCode;

public class MoveZeroes_Leetcode_283 {

    public static void main(String [] args){

        int [] nums = {0,1,0,3,12};
        moveZeroest(nums);
    }


    public static void moveZeroest(int [] nums){
        int j=0,i;

        for( i=0;i<=nums.length-1;i++){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
        }

        while(j<=nums.length-1){
            nums[j]=0;
            j++;
        }

        for( i=0;i<=nums.length-1;i++){
            System.out.print(nums[i]+" ");
        }
    }


}
