package MixedQuestions;
import java.util.*;
/**
 * Created by kunal on 3/20/18.
 * Given an integer array with even length, where different numbers in this array represent different kinds of candies. Each number means one candy of the corresponding kind. You need to distribute these candies equally in number to brother and sister. Return the maximum number of kinds of candies the sister could gain.
 Example 1:
 Input: candies = [1,1,2,2,3,3]
 Output: 3
 Explanation:
 There are three different kinds of candies (1, 2 and 3), and two candies for each kind.
 Optimal distribution: The sister has candies [1,2,3] and the brother has candies [1,2,3], too.
 The sister has three different kinds of candies.
 Example 2:
 Input: candies = [1,1,2,3]
 Output: 2
 Explanation: For example, the sister has candies [2,3] and the brother has candies [1,1].
 The sister has two different kinds of candies, the brother has only one kind of candies.
 Note:

 The length of the given array is in range [2, 10,000], and will be even.
 The number in given array is in range [-100,000, 100,000].
 */
public class DistributeCandies {

    public int distributeCandies(int[] candies) {


//         //Aproach 1: Bruter Force :  since each person can have max totalcandies/2 we mark al the duplicate invalid and increase the count of unique candy upto max totalcandies/2 . better brute force still not optimized


//         int count=0;
//         for(int i=0;i<candies.length;i++){
//             if(count==candies.length/2) break;
//             if(candies[i]!=Integer.MIN_VALUE)
//                 count++;

//             for(int j=i+1;j<candies.length;j++){
//                 if(candies[j]==candies[i])
//                     candies[j]=Integer.MIN_VALUE;
//             }

//         }

//         return count;

        //         //Aproach 2: Sort the aray first :  since each person can have max totalcandies/2 we increase the count only when its unique upto totalcanies/2.
        Arrays.sort(candies);
        int count=1;
        for(int i=1;i<candies.length;i++){
            if(count==candies.length/2) break;
            if(candies[i]>candies[i-1]) count++;
        }

        return count;




    }

    public static void main(String[] args) {
        DistributeCandies d = new DistributeCandies();
        System.out.println(d.distributeCandies(new int[]{1,1,2,2,3,4}));
    }
}
