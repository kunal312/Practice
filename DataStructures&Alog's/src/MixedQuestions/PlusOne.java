package MixedQuestions;

/**
 * Created by kunal on 2/7/18.
 *
 * Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.

 You may assume the integer do not contain any leading zero, except the number 0 itself.

 The digits are stored such that the most significant digit is at the head of the list.
 *
 * Ex: Input: {0}
 *      Output:{1}
 *      Input: {9}
 *      Output:{1,0}
 *      Input: {5,6}
 *      Output:{5,7}
 */

public class PlusOne {

    public int[] plusOne(int[] digits) {


        //1st method take carry flag

        if(digits==null || digits.length==0){
            return digits;
        }

        int carry =1;

        for(int i= digits.length-1;i>=0;i--){
            int sum = digits[i]+ carry;
            if(sum>=10){
                carry =1;
            }else
                carry =0;
            digits[i]= sum%10;
        }

        if(carry ==1){
            int [] newResult = new int[digits.length+1];
            newResult[0]=1;
            for(int i=0;i<digits.length;i++){
                newResult[i+1] =digits[i];
            }
            return newResult;
        }

        return digits;




        /*2nd Method
        int  len = digits.length-1;

        if(digits[len] !=9)
            digits[len] = digits[len] +1;
        else{
            while(digits[len] == 9 && len!=0){
                digits[len] = 0;
                len--;
            }

            if(len==0 && digits[len]==9){
                digits[len] = 0;
                int newArray [] = new int[digits.length+1];
                newArray[0] = 1;
                for(int i=0;i<digits.length;i++){
                    newArray[i+1] = digits[i];
                }
                return newArray;

            }else{
                digits[len] = digits[len] +1;
            }

        }
        return digits;*/

    }

    public static void main(String[] args){

        PlusOne p = new PlusOne();
        int [] digits = {2,3,4};
       int [] result = p.plusOne(digits);
       for(int i=0;i<result.length;i++){
           System.out.println(result[i]);
       }
        int [] digits1 = {0};

        int [] digits2 = {1,0};

        int [] digits3 = {9,1};


    }


}
