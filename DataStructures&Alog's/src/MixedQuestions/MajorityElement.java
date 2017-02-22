package MixedQuestions;

/**
 * Created by kunal on 2/21/17.
 Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

 You may assume that the array is non-empty and the majority element always exist in the array.
 */
public class MajorityElement {

    public void majorityElement(int[] nums) {
        int max = nums[0];
        int count = 1;
        for(int i =1;i<nums.length;i++){

            if(count==0){
                count++;
                max = nums[i];
            }else if(max == nums[i]){
                count++;
            }else
                count--;
        }

        System.out.println(max);
    }

    public static void main(String[] args){
        MajorityElement elem = new MajorityElement();
        int [] arr = {1,5,5,4,5,4,4,5,5,6};
        elem.majorityElement(arr);
    }
}


