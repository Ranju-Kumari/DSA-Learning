package LeetCode;

public class MajorityElement_LC_169 {

    public static void main(String [] args){
        int [] nums ={2,0,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }


  // This is O(n*n) time complexity approach. 
  // This will give TLE error for large inputs constraints -109 <= nums[i] <= 109
    public static int majorityElement(int[] nums){

        int count =0;
        for(int i=0;i<=nums.length-1;i++){
            count =0;
            for(int j=0;j<=nums.length-1;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>nums.length/2)
                return nums[i];
        }

        return -1;
    }




}
