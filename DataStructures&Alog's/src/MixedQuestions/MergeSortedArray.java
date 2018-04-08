package MixedQuestions;

/**
 * Created by kunal on 4/7/18.
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

 Note:
 You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.
 */
public class MergeSortedArray {

    /*
    * The approach is to start from the end and start comparing numbers from both the array, whiche
    *ver is greater we put that number in the end and decrement the counter only for that array not the other because other
     * number has still not found its proper place.
      * Secondly, if size of array 1 is greater it would be taken care by first loop, however if size of array 2 is greater second loop will place them in its correct position if any.
    * */
    public void merge(int[] nums1, int m, int[] nums2, int n) {


       int i = m-1,j=n-1;
       int k=m+n-1;

       while(i>=0 && j>=0){
           if(nums1[i]>nums2[j]){
               nums1[k] = nums1[i];
               i--;
           } else{
               nums1[k]=nums2[j];
               j--;
           }
           k--;
       }
       while(j>=0){
           nums1[k]=nums2[j];
           k--;
           j--;
       }
    }

    public static void main(String[] args) {

        MergeSortedArray m = new MergeSortedArray();
        int [] nums1 = new int[9];
        nums1[0]=2;
        nums1[1]=3;
        nums1[2]=6;
        nums1[3]=8;

        m.merge(nums1,4,new int[]{1,4,5,7},4);




    }


}
