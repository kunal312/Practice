package MixedQuestions;

/**
 * Created by kunal on 3/19/18.
 * Write a program to check whether a given number is an ugly number.

 Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. For example, 6, 8 are ugly while 14 is not ugly since it includes another prime factor 7.

 Note:

 1 is typically treated as an ugly number.
 Input is within the 32-bit signed integer range.
 */
public class UglyNumber {


    public boolean isUgly(int num) {

        if(num == 1) return true;
        if(num==0) return false;


        while(num%2==0) num=num/2;
        while(num%3==0) num=num/3;
        while(num%5==0) num=num/5;


        if(num==1) return true;


        return false;

    }

    public static void main(String[] args) {
        UglyNumber u = new UglyNumber();
        System.out.println(u.isUgly(10));
    }


}
