package MixedQuestions;

/**
 * Created by kunal on 3/16/18.
 * Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive), prove that at least one duplicate number must exist. Assume that there is only one duplicate number, find the duplicate one.

 Note:
 You must not modify the array (assume the array is read only).
 You must use only constant, O(1) extra space.
 Your runtime complexity should be less than O(n2).
 There is only one duplicate number in the array, but it could be repeated more than once.
 */
public class FindDuplicate {

    public int findDuplicate(int[] nums) {

        int tortoise = nums[0];
        int hare = nums[0];
        do{

            tortoise =nums[tortoise];
            hare=nums[nums[hare]];

        }while(tortoise!=hare);

        int ptr1=nums[0];
        int ptr2=tortoise;

        while(ptr1!=ptr2){
            ptr1=nums[ptr1];
            ptr2=nums[ptr2];

        }

        return ptr1;
    }

    public static void main(String[] args) {
        FindDuplicate f = new FindDuplicate();
        System.out.println(f.findDuplicate(new int []{1, 1, 6, 4, 5, 6, 3}));
    }

}
