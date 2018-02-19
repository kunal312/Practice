package MixedQuestions;
import java.util.*;

/**
 * Created by kunal on 3/4/17.
 */
public class MatchingPairs {

    private static int getStringMatchNumber(String input) {

        int res = -1;
        Stack<Character> S = new Stack<>();

        for(int i=0;i<input.length();i++){
            char c = input.charAt(i);
            if(Character.isUpperCase(c)){
                S.push(c);
            }
            else{
                if(S.isEmpty())
                    break;
                else{
                    char f = S.peek();
                    if(Character.toUpperCase(c)== f){
                        res = i;
                        S.pop();
                    }
                    else
                        break;
                }
            }

        }
        return res;

    }




    public static void main(String [] args){


        //MatchingPairs p = new MatchingPairs();
       // System.out.println(getStringMatchNumber("ABba"));

        System.out.println(getStringMatchNumber("LBBbbNnUQqubl"));
    }
}
