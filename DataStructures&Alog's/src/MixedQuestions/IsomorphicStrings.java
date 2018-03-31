package MixedQuestions;
import java.util.*;

/**
 * Created by kunal on 3/22/18.
 *
 Given two strings s and t, determine if they are isomorphic.

 Two strings are isomorphic if the characters in s can be replaced to get t.

 All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

 For example,
 Given "egg", "add", return true.

 Given "foo", "bar", return false.

 Given "paper", "title", return true.

 Note:
 You may assume both s and t have the same length.
 */
public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        HashMap<Character, Character> map1 = new HashMap<>();
        char []sc = s.toCharArray();
        char []tc = t.toCharArray();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(sc[i])){
                if(tc[i]!=map.get(sc[i])) return false;
                else continue;
            }else if(map1.containsKey(tc[i])){
                if(sc[i]!=map1.get(tc[i])) return false;
                else continue;
            }
            else  if(!map.containsKey(sc[i]) && map.containsKey(tc[i])){
                if(map.get(tc[i])==tc[i])
                    return false;
            }

            map.put(sc[i],tc[i]);
            map1.put(tc[i],sc[i]);


        }

        return true;

    }

    public static void main(String[] args) {
        IsomorphicStrings iso = new IsomorphicStrings();
        System.out.println(iso.isIsomorphic("boo","far"));
    }

}
