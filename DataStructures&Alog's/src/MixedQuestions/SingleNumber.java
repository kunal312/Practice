package MixedQuestions;

/**
 * Created by kunal on 4/4/18.
 * Given an array of integers, every element appears twice except for one. Find that single one.

 Note:
 Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?


 */
public class SingleNumber {

    public int singleNumber(int[] nums) {

        int diff =0;
        for(int num:nums){
            diff = diff^num;
        }

        return diff;
    }

    public static void main(String[] args) {
        SingleNumber s = new SingleNumber();
        System.out.println(s.singleNumber(new int[]{1,2,3,3,1,2,6,4,5,4,5}));

    }
}
