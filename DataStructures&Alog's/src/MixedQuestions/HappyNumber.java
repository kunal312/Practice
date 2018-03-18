package MixedQuestions;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by kunal on 3/17/18.
 * Write an algorithm to determine if a number is "happy".

 A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

 Example: 19 is a happy number

 12 + 92 = 82
 82 + 22 = 68
 62 + 82 = 100
 12 + 02 + 02 = 1
 */
public class HappyNumber {

    public boolean isHappy(int n) {
        int x = n;
        int y = n;

        while (x > 1) {

            x = sumofdigis(x);
            if(x==1) return true;;
            y=sumofdigis(sumofdigis(y));
            if(y==1) return true;

            if(x==y) return false;

        }

        return true;
    }

     public int sumofdigis(int n){
            int sum=0;
            while(n>0){
                int rem = n%10;
                n=n/10;
                sum+=rem*rem;
            }
            return sum;
    }




    //With ExtraSpace
    public boolean isHappyWithExtraSpace(int n){

        HashSet<Integer> set = new HashSet<>();
        int sd;

        while(set.add(n)){
            sd=0;
            while(n>0){
                int rem = n%10;
                n=n/10;
                sd += rem*rem;

            }
            if(sd==1) return true;
            else
                n=sd;


        }



        return false;


    }

    public static void main(String[] args) {
        HappyNumber  h = new HappyNumber();
        System.out.println(h.isHappy(1));
        System.out.println(h.isHappy(12));
        System.out.println(h.isHappy(19));
    }

}
