package MixedQuestions;

/**
 * Created by kunal on 4/2/18.
 * In a given integer array nums, there is always exactly one largest element.

 Find whether the largest element in the array is at least twice as much as every other number in the array.

 If it is, return the index of the largest element, otherwise return -1.

 Example 1:

 Input: nums = [3, 6, 1, 0]
 Output: 1
 Explanation: 6 is the largest integer, and for every other number in the array x,
 6 is more than twice as big as x.  The index of value 6 is 1, so we return 1.


 Example 2:

 Input: nums = [1, 2, 3, 4]
 Output: -1
 Explanation: 4 isn't at least as big as twice the value of 3, so we return -1.


 Note:

 nums will have a length in the range [1, 50].
 Every nums[i] will be an integer in the range [0, 99].
 */
public class LargestNumberAtLeastTwiceofOthers {



    //Another approach except below is to calculate max in one iteration, and chekc in another iteration
    // if for any number max>2of that number

    public int dominantIndex(int[] nums) {
        if(nums.length<2) return 0;
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(secMax<nums[i] && max < nums[i]){
                secMax = max;
                max=nums[i];
                index = i;
            } else if(secMax<nums[i] && max > nums[i]){
                secMax =nums[i];
            }

        }
        return max>=2*secMax ? index : -1;
    }

    public static void main(String[] args) {
        LargestNumberAtLeastTwiceofOthers l = new LargestNumberAtLeastTwiceofOthers();
        System.out.println(l.dominantIndex(new int[]{0,0,2,1}));
    }


}
