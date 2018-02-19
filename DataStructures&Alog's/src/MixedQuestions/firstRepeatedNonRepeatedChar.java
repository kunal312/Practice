package MixedQuestions;

import java.util.HashMap;

/**
 * Created by kunal on 2/19/17.
 */

//Find First Repeated And Non-Repeated Character In A String.

public class firstRepeatedNonRepeatedChar {


    public void findrep(String str){

        HashMap<Character,Integer> map = new HashMap<>();

        char [] ch = str.toCharArray();

        for( char c: ch){
                if(map.containsKey(c)){
                    map.put(c,map.get(c)+1);
                }
                else{
                    map.put(c,1);
                }

        }







        for(char c: ch){
            if(map.get(c)>1){
                System.out.println("First Repeatating character "+c);
                break;
            }
        }


            for(char c : ch){


            if(map.get(c)==1){
                System.out.println("First Non Repeatating character "+c);
                break;
            }
        }



    }

    public static void main(String[] args){

        firstRepeatedNonRepeatedChar r = new firstRepeatedNonRepeatedChar();
        r.findrep("ybccbiiaagagagaijogaoxgag");
    }


}
