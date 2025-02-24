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

    //O(n) approach :
    // Find the product of all numbers
    // Then one by one divide each element of the array by the productOfAllnums which will give the answer[i]
    // containing product of all nums except the number itself.
    // Note: This approach will not work for the input array conating 0 as array element.
    public static int[] productExceptSelf(int [] nums){
        int [] answer = new int[nums.length];
        int productOfAllNums=1;
        for(int i=0;i<=nums.length-1;i++){
            productOfAllNums=productOfAllNums*nums[i];
            System.out.println(productOfAllNums);
        }

        for(int i=0;i<=nums.length-1;i++){
            answer[i]=productOfAllNums/nums[i];
        }
        return answer;
    }
    
    //O(n^2) approach
    public static int [] productExceptSelf_BruteForce(int[] nums){
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
