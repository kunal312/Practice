package MixedQuestions;

/**
 * Created by kunal on 4/27/18.
 * Given an array of distinct integers, find length of the longest subarray which contains numbers that can be arranged in a continuous sequence.
 * No Duplicates

 Examples:

 Input:  arr[] = {10, 12, 11};
 Output: Length of the longest contiguous subarray is 3

 Input:  arr[] = {14, 12, 11, 20};
 Output: Length of the longest contiguous subarray is 2

 Input:  arr[] = {1, 56, 58, 57, 90, 92, 94, 93, 91, 45};
 Output: Length of the longest contiguous subarray is 5
 */
public class LengthOfLargestSubarraywithContiguousElements {

    //O(n2)
    //Idea is to keep track of min and max and anytime difference of max and min is equal to that is one subarray of contiguous elements and take max length out of it.
    public int findLength(int []nums){

    if(nums ==null|| nums.length==0) return 0;
    int n = nums.length;
    int maxLength=Integer.MIN_VALUE;
    //Make sure to run this loop upto n-1 that is it should stop at second last element
    for(int i=0;i<n-1;i++){
        int min = nums[i];
        int max = nums[i];
        for(int j=i+1;j<n;j++){
            min = Math.min(min,nums[j]);
            max = Math.max(max,nums[j]);
            if(max - min == j-i){
                maxLength = Math.max(maxLength,j-i+1);
            }
        }
    }

    return maxLength;
    }


    public static void main(String[] args) {
        System.out.println(new LengthOfLargestSubarraywithContiguousElements().findLength(new int[]{1, 56, 58, 57, 90, 92, 94, 93, 91, 45}));
        System.out.println(new LengthOfLargestSubarraywithContiguousElements().findLength(new int[]{14, 12, 11, 20}));
        System.out.println(new LengthOfLargestSubarraywithContiguousElements().findLength(new int[]{10, 12, 11}));



    }

}
