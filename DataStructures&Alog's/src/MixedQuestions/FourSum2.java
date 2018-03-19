package MixedQuestions;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kunal on 3/18/18.
 * Given four lists A, B, C, D of integer values, compute how many tuples (i, j, k, l) there are such that A[i] + B[j] + C[k] + D[l] is zero.

 To make problem a bit easier, all A, B, C, D have same length of N where 0 ≤ N ≤ 500. All integers are in the range of -228 to 228 - 1 and the result is guaranteed to be at most 231 - 1.

 Example:

 Input:
 A = [ 1, 2]
 B = [-2,-1]
 C = [-1, 2]
 D = [ 0, 2]

 Output:
 2

 Explanation:
 The two tuples are:
 1. (0, 0, 0, 1) -> A[0] + B[0] + C[0] + D[1] = 1 + (-2) + (-1) + 2 = 0
 2. (1, 1, 0, 0) -> A[1] + B[1] + C[0] + D[0] = 2 + (-1) + (-1) + 0 = 0
 */
public class FourSum2 {

    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {

        int n = A.length;
        Map<Integer, Integer> map = new HashMap();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int k = A[i] + B[j];
                int v = map.getOrDefault(k, 0) + 1;
                map.put(k, v);
            }
        }

        int res = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int s = C[i] + D[j];
                if(map.containsKey(-s)){
                    res += map.get(-s);
                }
            }
        }
        return res;

    }

    public static void main(String[] args) {
        FourSum2 s = new FourSum2();
        int []a={1,2};
        int []b={-2,-1};
        int []c={-1,2};
        int []d={0,2};


        System.out.println(s.fourSumCount(a,b,c,d));
    }


}
