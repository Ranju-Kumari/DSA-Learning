package dsa_learning.Arrays.Leetcode;

public class ShuffleTheArray_LC_1470 {

    public static void main(String [] args){
        int [] nums = {2,5,1,3,4,7};
        int n= 3;
        int [] newnums= shuffle(nums, n);

        for(int i=0; i<newnums.length; i++){
            System.out.print(newnums[i]+" ");
        }
    }

    public static int[] shuffle(int[] nums, int n) {

        int j=0;
        int [] temArray = new int[nums.length];

        //A temp array to store the array elements of the original array
        for(int i=0;i<nums.length-1;i++){
            temArray[i]= nums[i];
        }

        for(int i=0;i<nums.length-1;i++){
            if(i%2==0){
                nums[i] = temArray[j];
                j++;

            }else{
                // then store the array elements of the temp array
                // at the odd indices of the original array
                nums[i] = temArray[n];
                n++;
            }
        }
        return nums;
    }

}
