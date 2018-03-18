package MixedQuestions;

/**
 * Created by kunal on 3/17/18.
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

 Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.


 */
public class HouseRobber {


    public int rob(int[] nums) {

        int pr = 0;
        int nr=0;
        for(int i=0;i<nums.length;i++){


            //If we did not rob the previous house curr should be robbed
            int currRobb = nr+nums[i];

            //CurrNotRobb should be max between pr or nr
            int currNotRobb = Math.max(pr,nr);

            pr = currRobb;

            nr=currNotRobb;

        }

            return Math.max(pr,nr);

    }

    public static void main(String[] args) {
        HouseRobber h = new HouseRobber();
        System.out.println(h.rob(new int[]{5,16,8,9,10}));

    }

}
