package MixedQuestions;

import Test.Cache.Address;

/**
 * Created by kunal on 4/3/18.
 * Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.

 Note:

 The length of both num1 and num2 is < 5100.
 Both num1 and num2 contains only digits 0-9.
 Both num1 and num2 does not contain any leading zero.
 You must not use any built-in BigInteger library or convert the inputs to integer directly.
 */
public class AddStrings {

    public String addStrings(String num1, String num2){


        if(num1.length()<1){
            return num2;
        }
        if(num2.length()<1){
            return num1;
        }



        char [] number1 = num1.toCharArray();
        char [] number2= num2.toCharArray();


        StringBuilder res = new StringBuilder();
        int i=number1.length-1;
        int j=number2.length-1;
        int digit1=0;
        int digit2=0;
        int carry = 0;

        while(i>=0 || j>=0){
            if(i>=0)
                digit1 = number1[i]-'0';
            else digit1=0;
            if(j>=0)
                digit2 = number2[j]-'0';
            else
                digit2=0;

            int sum = digit1+digit2+carry;
            carry=0;
            if(sum>9)    carry=1;

            res.append(sum%10);

            if(i>=0)i--;

            if(j>=0)j--;

        }
        if(carry==1)
            res.append("1");

        return res.reverse().toString();
    }



public static void main(String[] args) {
    AddStrings s = new AddStrings();
    System.out.println(s.addStrings("16","15"));
}

}
