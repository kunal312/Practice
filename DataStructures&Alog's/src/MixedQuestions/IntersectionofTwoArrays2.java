package MixedQuestions;
import java.util.*;

/**
 * Created by kunal on 3/16/18.
 *
 * Given two arrays, write a function to compute their intersection.

 Example:
 Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].

 Note:
 Each element in the result should appear as many times as it shows in both arrays.
 The result can be in any order.
 Follow up:
 What if the given array is already sorted? How would you optimize your algorithm?
 What if nums1's size is small compared to nums2's size? Which algorithm is better?
 What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?

 */
public class IntersectionofTwoArrays2 {

    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();

        for(int i=0;i<nums1.length;i++){
            int x = nums1[i];
            if(map.containsKey(x)) map.put(x,map.get(x)+1);
            else
                map.put(x,1);
        }

        for(int i=0;i<nums2.length;i++){
            int x= nums2[i];
            if(map.containsKey(x) && map.get(x)>0){
                res.add(x);
                map.put(x,map.get(x)-1);
            }
        }

        int [] result = new int[res.size()];
        for(int i=0;i<res.size();i++){
            result[i] = res.get(i);
        }

        return result;


    }

    public static void main(String[] args) {


        IntersectionofTwoArrays2 i  = new IntersectionofTwoArrays2();
        i.intersect(new int[]{1,2,2,1},new int[]{2,2});
    }

}
