package MixedQuestions;

import java.util.*;
/**
 * Created by kunal on 2/24/18.
 *
 * Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard like the image below.
 Example 1:
 Input: ["Hello", "Alaska", "Dad", "Peace"]
 Output: ["Alaska", "Dad"]
 Note:
 You may use one character in the keyboard more than once.
 You may assume the input string will only contain letters of alphabet.

 */


/*Approach:
* We can store the row index in hashmap of each character and in the given string check if all of them belo to smae row index else skip that string.
* */



public class KeyboardRow {

    public String[] findWords(String[] words){

        String[] strs = {"QWERTYUIOP","ASDFGHJKL","ZXCVBNM"};
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            for(char c : strs[i].toCharArray())
                map.put(Character.toLowerCase(c),i+1);
        }

        List<String> res = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            int x = map.get(words[i].toLowerCase().charAt(0));
            boolean isValid = true;
            for(char c :words[i].toCharArray()){
                if(x != map.get(Character.toLowerCase(c))) {
                    isValid = false;
                    break;
                }

            }
            if(isValid){
                res.add(words[i]);
            }
        }
        return res.toArray(new String[0]);


    }

    public static void main(String[] args) {
        KeyboardRow r = new KeyboardRow();
        String [] s = {"Hello", "Alaska", "Dad", "Peace"};
        r.findWords(s);
    }

}
