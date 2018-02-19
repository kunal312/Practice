//package MixedQuestions;
//
///**
// * Created by kunal on 2/13/18.
// */
//import java.util.*;
//
//class TestCountA
//{
//    static int arr[] = new int[]{1,3,46,1,3,9} ;
//
//
//    // Returns number of pairs in arr[0..n-1] with sum equal
//    // to 'sum'
//    static int getPairsCount(int n, int sum)
//    {
//
//
//        HashSet<Integer> set = new HashSet<Integer>();
//        for (int e : arr) {
//            if (set.contains(sum-e)) {
//                System.out.println(e + "," + (sum-e));
//                // deal with the duplicated case
//                set.remove(sum-e);
//            } else {
//                set.add(e);
//            }
//
//
//
//
//        HashMap<Integer, Integer> hm = new HashMap<>();
//
//        // Store counts of all elements in map hm
//        for (int i=0; i<n; i++){
//
//            // initializing value to 0, if key not found
//            if(!hm.containsKey(arr[i]))
//                hm.put(arr[i],0);
//
//            hm.put(arr[i], hm.get(arr[i])+1);
//        }
//        int twice_count = 0;
//
//        // iterate through each element and increment the
//        // count (Notice that every pair is counted twice)
//        for (int i=0; i<n; i++)
//        {
//            if(hm.get(sum-arr[i]) != null)
//                twice_count += hm.get(sum-arr[i]);
//
//            // if (arr[i], arr[i]) pair satisfies the condition,
//            // then we need to ensure that the count is
//            // decreased by one such that the (arr[i], arr[i])
//            // pair is not considered
//            if (sum-arr[i] == arr[i])
//                twice_count--;
//        }
//
//        // return the half of twice_count
//        return twice_count/2;
//    }
//
//    // Driver method to test the above function
//    public static void main(String[] args) {
//
//        int sum = 47;
//        System.out.println("Count of pairs is " +
//                getPairsCount(arr.length,sum));
//
//    }
//}