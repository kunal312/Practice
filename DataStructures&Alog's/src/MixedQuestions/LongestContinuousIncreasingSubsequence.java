package MixedQuestions;

/**
 * Created by kunal on 4/2/18.
 * Given an unsorted array of integers, find the length of longest continuous increasing subsequence (subarray).

 Example 1:
 Input: [1,3,5,4,7]
 Output: 3
 Explanation: The longest continuous increasing subsequence is [1,3,5], its length is 3.
 Even though [1,3,5,7] is also an increasing subsequence, it's not a continuous one where 5 and 7 are separated by 4.
 Example 2:
 Input: [2,2,2,2,2]
 Output: 1
 Explanation: The longest continuous increasing subsequence is [2], its length is 1.
 Note: Length of the array will not exceed 10,000.


 */
public class LongestContinuousIncreasingSubsequence {

    public int findLengthOfLCIS(int[] nums) {
        if(nums.length<1) return 0;
        int max=Integer.MIN_VALUE;
        int l =1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]) l++;
            else{
                if(max<l) max=l;
                l=1;
            }

        }
        if(max<l) max=l;
        return max;
    }

    public static void main(String[] args) {
        LongestContinuousIncreasingSubsequence l = new LongestContinuousIncreasingSubsequence();

        System.out.println(  l.findLengthOfLCIS(new int[]{1,3,5,4,7,8,9,10,11,12}));
    }

}
