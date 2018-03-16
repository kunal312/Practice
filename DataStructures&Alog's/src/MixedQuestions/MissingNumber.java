package MixedQuestions;

/**
 * Created by kunal on 3/16/18.
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

 Example 1

 Input: [3,0,1]
 Output: 2
 Example 2

 Input: [9,6,4,2,3,5,7,0,1]
 Output: 8

 Note:
 Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?


 */
public class MissingNumber {

//USing XOR
    public int missingNumber(int[] nums) {

        int res = nums.length;
        for(int i=0;i<nums.length;i++){
            res^=i;
            res^=nums[i];
        }

        return res;


    }
//Using sum difference by actual sum of AP - the sum of elements.
    public int missingNumber2(int [] nums){

        int n = nums.length;
        int sum=(n*(n+1))/2;
        int actualsum=0;
        for(int i=0;i<nums.length;i++){

            actualsum+=nums[i];
        }

        return sum-actualsum;


    }


    public static void main(String[] args) {

        MissingNumber m = new MissingNumber();
        System.out.println(m.missingNumber2(new int []{9,6,4,2,3,5,7,0,1}));


    }
}
