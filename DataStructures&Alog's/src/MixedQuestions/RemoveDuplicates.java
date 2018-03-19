package MixedQuestions;

/**
 * Created by kunal on 3/18/18.
 */
public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {

        //Trick: Two pointers one pointer holds the correct locatio where next non duplicate is to be placed, other finds that non duplicate value
        //We keep on iterating if we are finding continuous duplicates once we reach non duplicate we assign to its corect location and keep that position and repeat.
        int i=0;
        for(int j=1;j<nums.length;j++){

            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];

            }
        }
        return i+1;

    }

    public static void main(String[] args) {
        RemoveDuplicates r= new RemoveDuplicates();
        r.removeDuplicates(new int[]{1,1,2});
    }
}
