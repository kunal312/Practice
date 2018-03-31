package MixedQuestions;
import java.util.*;

/**
 * Created by kunal on 3/30/18.
 * Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.

 Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.

 The order of output does not matter.

 Example 1:

 Input:
 s: "cbaebabacd" p: "abc"

 Output:
 [0, 6]

 Explanation:
 The substring with start index = 0 is "cba", which is an anagram of "abc".
 The substring with start index = 6 is "bac", which is an anagram of "abc".
 Example 2:

 Input:
 s: "abab" p: "ab"

 Output:
 [0, 1, 2]

 Explanation:
 The substring with start index = 0 is "ab", which is an anagram of "ab".
 The substring with start index = 1 is "ba", which is an anagram of "ab".
 The substring with start index = 2 is "ab", which is an anagram of "ab".

 */

public class FindAllAnagrams {



    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> res = new ArrayList<>();
        if(p.length()>s.length()) return res;

        Map<Character,Integer> map = new HashMap<>();
        for(char c:p.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        int begin =0;
        int end=0;
        int counter =map.size();

        while(end<s.length()){
            char c = s.charAt(end);
            if(map.containsKey(c)){
                map.put(c,map.get(c)-1);
                if(map.get(c)==0) counter--;
            }
            end++;
                while(counter==0){
                    char tempc = s.charAt(begin);
                    if(map.containsKey(tempc)){
                        map.put(tempc,map.get(tempc)+1);
                        if(map.get(tempc)>0) counter++;
                    }

                    if(end-begin==p.length()) res.add(begin);

                    begin++;
                }
        }

        return res;
    }


    public static void main(String[] args) {

        FindAllAnagrams w = new FindAllAnagrams();
        List<Integer> res = w.findAnagrams("cbaebabacd","abc");
        Iterator itr = res.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }



}
