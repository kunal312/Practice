package MixedQuestions;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by kunal on 4/8/18.
 * Given an array of 2n integers, your task is to group these integers into n pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.

 Example 1:
 Input: [1,4,3,2]

 Output: 4
 Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).
 Note:
 n is a positive integer, which is in the range of [1, 10000].
 All the integers in the array will be in the range of [-10000, 10000].

 */
public class ArrayPartitionI {

    public int arrayPairSum(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int maxSum = 0;
        for(int i=0;i<nums.length;i+=2){
            maxSum+=nums[i];
        }

        return maxSum;
    }

    public static void main(String[] args) {
        ArrayPartitionI a = new ArrayPartitionI();
        System.out.println(a.arrayPairSum(new int[]{1,4,2,3}));
    }
}
