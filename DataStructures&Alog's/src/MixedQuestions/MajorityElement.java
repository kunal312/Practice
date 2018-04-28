package MixedQuestions;

/**
 * Created by kunal on 2/21/17.
 Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

 You may assume that the array is non-empty and the majority element always exist in the array.
 */
public class MajorityElement {

    //Approach 1: hashmap
    //Approach 2:  sort and return n/2 element

    //Apporach3:
    /*
    * 1) Select 1st element as max Element
    * 2) Increment the count if the elemnt in array is same as max element
    * 3)If element in array is not same decrement the count
    * 4) When count becomes 0 that means all the prev elements are nullified, meaning majority elements = minority element so we can have new max Eleemnt selected
    * 5)so when count =0, select ne majrit element and repeat the same procedure
    * 6) In the end since majority element exists n/2 there will be case when count will not reach 0 and we can return this element.
    *
    * */
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


