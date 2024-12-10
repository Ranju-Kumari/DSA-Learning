package dsa_learning.DynamicProgramming.LeetCode;

import static java.lang.Math.max;

public class MaximumSubarray_LC_53 {

    public static void main(String [] args){
        int [] a = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Maximum sum is "+ maxSum_BigOofNsquareSoln(a));
//        System.out.println("Maximum sum is "+ maxSum_KadanesAlgo(a));

    }

    public static int maxSum_BigOofNsquareSoln(int [] a){

        int maxSum = Integer.MIN_VALUE;
        int n = a.length;
        int sum = 0;
        for(int i=0; i<=n-1;i++){
            sum = 0;

            for(int j=i; j<=n-1;j++){
                sum+=a[j];
                maxSum = max(sum, maxSum);
            }
        }
        return maxSum;
    }

    public static long maxSum_KadanesAlgo(int [] a){

        long sum=0;
        long maxSum = -1;
        int n=a.length;
        for(int i =0;i<=n-1;i++){
            sum+=a[i];
            if(sum>maxSum){
                maxSum = sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return maxSum;
    }
}
