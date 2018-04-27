package MixedQuestions;

import java.util.HashSet;

/**
 * Created by kunal on 4/27/18.
 * Given an array of integers, find length of the longest subarray which contains numbers that can be arranged in a continuous sequence.

 In the previous post, we have discussed a solution that assumes that elements in given array are distinct. Here we discuss a solution that works even if the input array has duplicates.

 Examples:

 Input:  arr[] = {10, 12, 11};
 Output: Length of the longest contiguous subarray is 3

 Input:  arr[] = {10, 12, 12, 10, 10, 11, 10};
 Output: Length of the longest contiguous subarray is 2
 */
public class LengthOfLargestSubarraywithContiguousElementsDup {

    //Similar to last apporach we use set to track duplicate elements. Make sure you are reinitializing set when i increases otherwise it will have older duplicates of which seq is already broken.
    public int findLength1(int []nums){

        if(nums==null || nums.length == 0) return 0;
        int maxLen = Integer.MIN_VALUE;

        for(int i=0;i<nums.length-2;i++){
            HashSet<Integer> set = new HashSet<>();
            set.add(nums[i]);
            int min = nums[i];
            int max =nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(set.contains(nums[j])) break;

                set.add(nums[j]);
                min = Math.min(min,nums[j]);
                max = Math.max(max,nums[j]);

                if(max - min == j-i){

                    maxLen = Math.max(maxLen,j-i+1);
                    System.out.println("Max Len:"+maxLen);
                }

            }
        }

        return maxLen;
    }


    public static void main(String[] args) {
        System.out.println(new LengthOfLargestSubarraywithContiguousElementsDup().findLength1(new int[]{10, 12, 12, 10, 10, 11, 10}));
        System.out.println(new LengthOfLargestSubarraywithContiguousElementsDup().findLength1(new int[]{14, 12, 11, 20}));
        System.out.println(new LengthOfLargestSubarraywithContiguousElementsDup().findLength1(new int[]{10, 12, 11}));



    }

}
