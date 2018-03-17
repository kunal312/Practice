package MixedQuestions;

/**
 * Created by kunal on 3/17/18.
 */
public class SumofTwoIntgers {

    public int getSum(int a, int b) {

        if(a==0) return b;
        if(b==0) return a;

        while(b!=0){
            int carry = a & b;
            a=a^b;
            b=carry<<1;

        }
        return a;

    }


    public static void main(String[] args) {
        SumofTwoIntgers s = new SumofTwoIntgers();
        System.out.println(s.getSum(6,8));
    }
}
