package MixedQuestions;

import java.util.HashSet;

/**
 * Created by kunal on 4/18/18.
 * Given an unsorted array of integers, find the length of the longest consecutive elements sequence.

 For example,
 Given [100, 4, 200, 1, 3, 2],
 The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.

 Your algorithm should run in O(n) complexity.
 */
public class LongestConsecutiveSequence {

    /*Time complexity : \mathcal{O}(n)O(n).

Although the time complexity appears to be quadratic due to the while loop nested within the for loop, closer inspection reveals it to be linear. Because the while loop is reached only when currentNum marks the beginning of a sequence (i.e. currentNum-1 is not present in nums), the while loop can only run for nn iterations throughout the entire runtime of the algorithm. This means that despite looking like \mathcal{O}(n*n)O(n∗n) complexity, the nested loops actually run in \mathcal{O}(n + n) = \mathcal{O}(n)O(n+n)=O(n) time. All other computations occur in constant time, so the overall runtime is linear.

Space complexity : \mathcal{O}(n)O(n).

In order to set up \mathcal{O}(1)O(1) containment lookups, we allocate linear space for a hash table to store the \mathcal{O}(n)O(n) numbers in nums. Other than that, the space complexity is identical to that of the brute force solution*/
    public int longestConsecutive(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        HashSet<Integer> set = new HashSet<>();
        for( int n: nums) set.add(n);

        int maxSeq =0;
        for(int num: nums) {
            // if there is no consecutive previous element means the new seq can be started
            if(!set.contains(num-1)){
                int currentSeq= 1;
                //check for this seq if further consequetive elements are present or break an dcheck of other numbers in set.
                while(set.contains(num+1)){
                    currentSeq++;
                    num++;
                }
                maxSeq = Math.max(currentSeq,maxSeq);
            }
        }
        return maxSeq;
    }

    public static void main(String[] args) {
        LongestConsecutiveSequence lc = new LongestConsecutiveSequence();
        System.out.println(lc.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));

    }

}
