package MixedQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Created by kunal on 4/8/18.
 * Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.
 For example,
 Given [3,2,1,5,6,4] and k = 2, return 5.

 Note:
 You may assume k is always valid, 1 ≤ k ≤ array's length.
 */
public class KthLargestElementinanArray {

    //Approach 1: Sort the elements and  return the length - kth element.
    //Complexity : O(nlogn), Space O(1)
    public int findKthLargest(int[] nums, int k) {

        Arrays.sort(nums);
        return nums[nums.length-k];
    }

    //Approach 2: Use Prirority Queue and keep checking if size is greater than k, if its greater than k poll the element, int this way we will
    //only have top k elements in array and then reutrn the element by poll/peek coz it would be the kth largest
    public int findKthLargest2(int[] nums, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num:nums) {
            pq.offer(num);
            if(pq.size()>k){
                pq.poll();
            }

        }

        //Instead of below check while insterting into queue itself
//        for(int i=0;i<nums.length;i++){
//            if(i==nums.length-k){
//                return pq.peek();
//            }
//            pq.poll();
//
//        }


        return pq.peek();

    }

    //Approach 3:
    public int findKthLargest3(int[]nums, int k){


        return 0;
    }

    public static void main(String[] args) {
        KthLargestElementinanArray k = new KthLargestElementinanArray();
        System.out.println(k.findKthLargest2(new int[]{3,2,1,5,6,4},2));
    }
}
