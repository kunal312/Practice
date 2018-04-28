package MixedQuestions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kunal on 4/28/18.
 */
public class MajorityElement2 {

    public List<Integer> majorityElement(int[] nums) {

        List<Integer> res = new ArrayList<>();
        if (nums.length == 0) return res;
        if (nums.length == 1) {
            res.add(nums[0]);
            return res;
        }

        int count1 = 0, count2 = 0;
        int element1 = 0, element2 = 0;
        for (int num : nums) {
            if (num == element1) {
                count1++;
                continue;
            } else if (num == element2) {
                count2++;
                continue;
            }

            if (count1 == 0) {
                element1 = num;
                count1 = 1;
                continue;
            } else if (count2 == 0) {
                element2 = num;
                count2 = 1;
                continue;
            }
            if (num != element1) count1--;
            if (num != element2) count2--;
        }

        //Since in above algorithm we have found our majority element but we need to check if its count>nums.length/3 due to multiple elements, n above algorithm we nullify counts
        //so we count the occurrences of that majority element again so that below count>nums.length/3 are satisfied
        //Test case :[1,3,2,3]
        count1 = 0;
        count2 = 0;
        for (int n : nums) {
            if (n == element1) {
                count1++;
            } else if (n == element2) {
                count2++;
            }
        }


        if (count1 > nums.length / 3) {
            res.add(element1);
            System.out.println(element1);
        }
        if (count2 > nums.length / 3) {
            res.add(element2);
            System.out.println(element2);
        }
        return res;
    }
    public static void main(String[] args) {
        MajorityElement2 m = new MajorityElement2();
       // m.majorityElement(new int[]{1,3,2,3});
        m.majorityElement(new int[]{2,2,2,3,3});
    }
}
