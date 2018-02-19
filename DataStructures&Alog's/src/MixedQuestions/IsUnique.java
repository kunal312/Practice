package MixedQuestions;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Created by kunal on 2/18/18.
 */

// Check if string is unique
public class IsUnique {

    //Complexity o(n) and space o(1)
    boolean isUniqueChars(String s){


        int checker = 0;
        for(int i =0;i<s.length();i++) {
            int val = s.charAt(i)-'a';
            if ((checker & (1 << val)) > 0)
                return false;
            checker = checker | (1 << val);
        }
        return true;
    }

//    boolean isUniqueChars1(String s){
//
//
//        //check if there are more than 128 chars as unique can only be 128
//        if(s.length()>128)
//            return false;
//        boolean [] uni = new boolean[128];
//        for(int i =0;i<s.length();i++) {
//            int val = s.charAt(i);
//            //if already exists return false
//            if (uni[val])
//                return false;
//            //since char is first time set to true
//            uni[val] = true;
//        }
//        return true;
//    }
//
//
//
    public static void main(String [] args){
        IsUnique u = new IsUnique();
        System.out.println(u.isUniqueChars("bacb"));
        System.out.println("****************");

        System.out.println(u.isUniqueChars("bcc"));

    }








}
