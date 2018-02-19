package MixedQuestions;
import java.util.*;

/**
 * Created by kunal on 2/19/17.
 */
public class LongestValidParenthesis {

    public void parenthesis(String str){


        Stack<Character> s = new Stack<>();

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
                s.push(str.charAt(i));
            }
            else if(str.charAt(i)==')'){
                s.pop();
            }

        }
        if(s.isEmpty()){
            System.out.println("Valid String");
        }else{
            System.out.println("Not Valid String");
        }

    }

    public static void main(String[] args){
        LongestValidParenthesis l = new LongestValidParenthesis();
        l.parenthesis("()((()");
    }
}
