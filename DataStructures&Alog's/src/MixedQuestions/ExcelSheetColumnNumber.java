package MixedQuestions;

/**
 * Created by kunal on 2/21/17.
 171.Given a column title as appear in an Excel sheet, return its corresponding column number.

 For example:

 A -> 1
 B -> 2
 C -> 3
 ...
 Z -> 26
 AA -> 27
 AB -> 28
 *
 *
 */

public class ExcelSheetColumnNumber {

    public int titleToNumber(String s) {

        int x =0;
        for(int i =0;i<s.length();i++){

            x = x * 26 + (s.charAt(i)- 'A' +1);
        }

        return x;
    }



    public static void main(String[] args){

        ExcelSheetColumnNumber string = new ExcelSheetColumnNumber();
        System.out.println(string.titleToNumber("AB"));
        System.out.println(string.titleToNumber("AA"));
        System.out.println(string.titleToNumber("ABCDE"));
    }

}
