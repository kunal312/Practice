package MixedQuestions;

/**
 * Created by kunal on 4/17/18.
 * Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.


 The above elevation map is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped. Thanks Marcos for contributing this image!

 Example:

 Input: [0,1,0,2,1,0,1,3,2,1,2,1]
 Output: 6
 */
public class Trappingtherainwater {

    public int trap(int[] height) {
        if(height==null || height .length==0) return 0;
        int leftMax = 0;
        int rightMax = 0;
        int left=0;
        int right = height.length-1;
        int res =0;
        while(left<right){
            if(height[left]<height[right]){
                if(leftMax <=height[left] )
                    leftMax = height[left];
                else
                    res+=leftMax-height[left];
                left++;
            }else{
                if(rightMax <=height[right]){
                    rightMax = height[right];
                }else
                    res+=rightMax-height[right];
                right--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Trappingtherainwater r = new Trappingtherainwater();
        System.out.println(r.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }
}
