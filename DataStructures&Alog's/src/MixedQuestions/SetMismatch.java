package MixedQuestions;
import java.util.*;

/**
 * Created by kunal on 2/24/18.
 * The set S originally contains numbers from 1 to n. But unfortunately, due to the data error, one of the numbers in the set got duplicated to another number in the set, which results in repetition of one number and loss of another number.

 Given an array nums representing the data status of this set after the error. Your task is to firstly find the number occurs twice and then find the number that is missing. Return them in the form of an array.

 Example 1:
 Input: nums = [1,2,2,4]
 Output: [2,3]
 Note:
 The given array size will in the range [2, 10000].
 The given array's numbers won't have any order.

 */
public class SetMismatch {

/*Approach 1: take hashmap and store the count. iterate again which key is not presnt is missing and which have count=2 is dup.
Approach 2: Take extra array and at every index increase the counter(arr[nums[i]]+=1. iterate again whichever arr[i]==2 that isduplicate and
 whichever is arr[i]=0 is missing
 Approach 3:Make every number at index -ve and check if number already negative at that index means this number is duplicate.
 In another loop check which evern number is >0 that index+1 is missing.*/

   //Approach 3:
    public int[] findErrorNums(int[] nums) {

        int dup=-1;
        int missing =1;
        for(int i=0;i<nums.length;i++){
            if(nums[(Math.abs(nums[i])-1)]<0){
                dup=Math.abs(nums[i]);
            }else{
                nums[(Math.abs(nums[i])-1)]*=-1;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                missing=i+1;
            }

        }
        return new int[]{dup,missing};

    }


    public static void main(String[] args) {
        SetMismatch m = new SetMismatch();
        int []x ={1,2,6,4,5,6,7,8,9,10};
        System.out.println(m.findErrorNums(x));
    }
}
