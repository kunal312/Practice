package MixedQuestions;

/**
 * Created by kunal on 2/21/17.
 283.Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

 For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

 Note:
 You must do this in-place without making a copy of the array.
 Minimize the total number of operations.

 */
public class MoveZeroes {

    public void moveZeroes(int[] nums) {

        int x = 0;

        for (int i =0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[x] = nums[i];
                x++;
            }
        }

        for(int i =x;i<nums.length;i++){
            nums[i]=0;
        }

        for(int i =0;i<nums.length;i++){
            System.out.print(nums[i]+",");
        }

    }

    public static void main(String[] args){
        MoveZeroes move = new MoveZeroes();
        int[] arr ={0, 1, 0, 3, 12};
        move.moveZeroes(arr);
    }

}
