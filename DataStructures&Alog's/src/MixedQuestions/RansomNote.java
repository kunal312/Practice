package MixedQuestions;

import java.util.HashMap;

/**
 * Created by kunal on 2/24/17.
 *383. Ransom Note
 *
 * Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.

 Each letter in the magazine string can only be used once in your ransom note.

 Note:
 You may assume that both strings contain only lowercase letters.

 canConstruct("a", "b") -> false
 canConstruct("aa", "ab") -> false
 canConstruct("aa", "aab") -> true

 */
public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {



        HashMap<Character,Integer> map = new HashMap<>();

        for(char mag : magazine.toCharArray()){
            if(map.containsKey(mag)){
                map.put(mag,map.get(mag)+1);
            }
            else
                map.put(mag,1);
        }

        for(char ran : ransomNote.toCharArray()){
            if(map.containsKey(ran)){
                if(map.get(ran)>1){
                    map.put(ran,map.get(ran)-1);
                }
                else
                    map.remove(ran);


            }else
                return false;
        }

    return true;

    }

    public static void main(String[] args){
        RansomNote rn = new RansomNote();
        System.out.println(rn.canConstruct("aa","abb"));
    }
}
