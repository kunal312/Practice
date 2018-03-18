package MixedQuestions;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by kunal on 3/17/18.
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
