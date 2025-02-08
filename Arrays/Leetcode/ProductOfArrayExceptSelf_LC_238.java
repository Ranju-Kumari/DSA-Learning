package dsa_learning.arrays.leetcode;

import java.util.Scanner;

public class ProductOfArrayExceptSelf_LC_238 {

    public static void main(String [] args){
        int [] nums = {-1,1,0,-3,3};
        int [] answer = productExceptSelf(nums);
        for(int i=0;i<=answer.length-1;i++){
            System.out.println(answer[i]);
        }
    }

    //O(n^2) approach
    public static int [] productExceptSelf(int[] nums){
        int [] answer = new int[nums.length];
        for(int i=0;i<=answer.length-1;i++){
            answer[i]=1;
        }

        for(int i=0;i<=nums.length-1;i++){
            for(int j=0;j<=nums.length-1;j++){
                if(i==j){
                    continue;
                }else{
                    answer[i]=answer[i]*nums[j];
                }
            }
        }
        return answer;
    }
}
