package MixedQuestions;

/**
 * Created by kunal on 3/17/18.
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

 For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
 the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 *
 */
public class MaximumSubarray {

    //hold the greatest value between current sum and current array value and return max of prevous sum and this value.
    public int maxSubArray(int[] nums) {

    int maxSum= nums[0];
    int currentSum=nums[0];
    for(int i=1;i<nums.length;i++){

        currentSum=Math.max(nums[i],currentSum+nums[i]);
        maxSum = Math.max(currentSum,maxSum);

    }

    return maxSum;



    }

    //whenever currentsum is -ve reset it to 0 and find max between previous sum and current sum
    public int maxSubArray2(int [] nums){

        int maxSum= Integer.MIN_VALUE;
        int currentSum=0;
        for(int i=0;i<nums.length;i++){
            maxSum=Math.max(currentSum+nums[i],maxSum);
            currentSum=Math.max(0,currentSum+nums[i]);

        }
        return maxSum;

    }


    public static void main(String[] args) {
        MaximumSubarray max = new MaximumSubarray();
        System.out.println(max.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        System.out.println(max.maxSubArray(new int[]{1}));

    }
}
