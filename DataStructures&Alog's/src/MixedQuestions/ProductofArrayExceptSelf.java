package MixedQuestions;

/**
 * Created by kunal on 3/18/18.
 * Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

 Solve it without division and in O(n).

 For example, given [1,2,3,4], return [24,12,8,6].

 Follow up:
 Could you solve it with constant space complexity? (Note: The output array does not count as extra space for the purpose of space complexity analysis.)
 */
public class ProductofArrayExceptSelf {

    //Approach: In first iteration , calculate left product , in sec iteration multiply with right product for the current elementach:
    public  int[] productExceptSelf(int[] nums){

        int n = nums.length;
        int res[] = new int[n];
        int temp=1;
        for(int i=0;i<n;i++){
            res[i]=temp;
            temp*=nums[i];
        }

        temp=1;
        for(int i=n-1;i>=0;i--){
            res[i]*=temp;
            temp*=nums[i];
        }

        return res;
    }

    public static void main(String[] args) {
        ProductofArrayExceptSelf p = new ProductofArrayExceptSelf();
        p.productExceptSelf(new int []{1,2,3,4});
    }
}
