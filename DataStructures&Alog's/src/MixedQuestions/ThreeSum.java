package MixedQuestions;

import java.util.*;

/**
 * Created by kunal on 2/20/17.
 */
public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> triplets = new ArrayList<List<Integer>>();
        if(nums.length<3 || nums.length==0){
            return triplets;
        }

        Arrays.sort(nums);
        int size =  nums.length;
        for(int i = 0;i<size-2;i++){

            if(i==0 || nums[i]>nums[i-1]){
                int start = i+1;
                int end = size-1;
                while(start<end){
                    if(nums[i]+nums[start]+nums[end]==0){
                        List<Integer> striplet = new ArrayList<Integer>();
                        striplet.add(nums[i]);
                        striplet.add(nums[start]);
                        striplet.add(nums[end]);
                        triplets.add(striplet);
                    }

                    if(nums[i]+nums[start]+nums[end]<0){
                        int currentstart = nums[start];
                        while(start<end && nums[start]==currentstart)
                            start++;
                    } else {
                        int currentend = nums[end];
                        while(start<end && nums[end]==currentend)
                            end--;

                    }
                }

            }
        }
        return triplets;
    }


    public static void main(String[] args){

        ThreeSum sum = new ThreeSum();
        int [] nums = {-1,0,1,2,-1,4};
        List<List<Integer>> x = sum.threeSum(nums);
        for(int i =0;i<x.size();i++){
            System.out.println("Triplets:"+x.get(i));
        }

    }
}
