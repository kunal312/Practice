package MixedQuestions;

/**
 * Created by kunal on 4/19/18.
 * Validate if a given string is numeric.

 Some examples:
 "0" => true
 " 0.1 " => true
 "abc" => false
 "1 a" => false
 "2e10" => true

 Note: It is intended for the problem statement to be ambiguous. You should gather all requirements up front before implementing one.

 Update (2015-02-10):
 The signature of the C++ function had been updated. If you still see your function signature accepts a const char * argument, please click the reload button to reset your code definition.
 */
public class ValidNumber {

    public boolean isNumber(String s) {

        if(s==null || s.length() == 0) return false;
        s=s.trim();
        boolean seenNumber = false;
        boolean seenDecimal = false;
        boolean seenE = false;

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            switch(c){

                case '.':
                    if(seenDecimal || seenE) return false;
                    seenDecimal = true;
                    break;
                case 'e':
                    if(seenE || !seenNumber) return false;
                    seenE = true;
                    seenNumber=false;
                    break;
                case '+':
                case '-':
                    if(i!=0 && s.charAt(i-1)!='e') return false;
                    seenNumber = false;
                    break;
                default:
                    if(c-'0'<0 || c-'0'>9) return false;
                    seenNumber = true;
            }
        }


return seenNumber;

    }

    public static void main(String[] args) {
        ValidNumber v = new ValidNumber();
        //Test Cases
        System.out.println(v.isNumber("-1."));//true
        System.out.println(v.isNumber("1.2."));//false
        System.out.println(v.isNumber("1.2e3"));//true
        System.out.println(v.isNumber("abc"));//false
        System.out.println(v.isNumber("0"));//true
        System.out.println(v.isNumber("0.1"));//true
        System.out.println(v.isNumber("1 a"));//false
        System.out.println(v.isNumber("2e10"));//true
        System.out.println(v.isNumber("2e+1"));//true
        System.out.println(v.isNumber("2e-1"));//true
        System.out.println(v.isNumber("2e-"));//false
        System.out.println(v.isNumber("2e+"));//false
        System.out.println(v.isNumber("2-e"));//false
        System.out.println(v.isNumber("2+e"));//false
        System.out.println(v.isNumber("e"));//false
    }

}
