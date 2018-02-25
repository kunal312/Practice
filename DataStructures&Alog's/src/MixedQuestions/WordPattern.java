package MixedQuestions;
import  java.util.*;

/**
 * Created by kunal on 2/24/18.
 */
public class WordPattern {


    /*Approach 1: Using a HashMap and Set, We can check if key exists in map then compare the value present at that key with the string value
    .Otherwise if key is not present and that string value is present in set that means that string value is associated with some other key earlier hence return false*/

    /*
    *  Time Complexity : O(n) where n = length of string
    *  Space Complexity: O(n) , hashmap
    * */
    public boolean wordPattern(String pattern, String str) {
        HashMap<Character,String> map1 = new HashMap<>();
        Set<String> set = new HashSet<>();
        String[] str1 = str.split(" ");
        if(pattern.length()!= str1.length) return false;
        for(int i=0;i<str1.length;i++){
            char c = pattern.charAt(i);
            if(map1.containsKey(c)){
                if(!map1.get(c).equals(str1[i])) return false;
            } else if(!map1.containsKey(c) && set.contains(str1[i])) return false;
            else{
                map1.put(c,str1[i]);
                set.add(str1[i]);
            }
        }

        return true;
    }


     /*Approach 2: Using a HashMap , we can store key with corresponding index and value with corresponding index int the same map.
      HashMap, put method works : if key does not exists it puts in the key and value and returns the null. If key already exists, it replaces the value
      and returns the older value. We can check both the return values should be same in ideal case or it means the value is already assigned key and hence return false.
    /*
    *  Time Complexity : O(n) where n = length of string
    *  Space Complexity: O(n) , hashmap
    * */
    public boolean wordPattern1(String pattern, String str){

        String[] str1 = str.split(" ");
        if(str1.length!=pattern.length()) return false;
        HashMap index  = new HashMap();
        for(int i=0;i<str1.length;i++){
            char c = pattern.charAt(i);
            String x =  index.put(c,i)+"";
            String y =  index.put(str1[i],i)+"";
            if(!Objects.equals(x,y)) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        WordPattern w = new WordPattern();
        String pat1 = "abba";
        String str1 ="dog cat cat dog";
        String pat2 = "abba";
        String str2 ="dog cat cat fish";
        String pat3 ="abba";
        String str3 ="dog dog dog dog";
       System.out.println(w.wordPattern1(pat1,str1));
       System.out.println("************");
       System.out.println(w.wordPattern1(pat2,str2));
        System.out.println("************");
        System.out.println(w.wordPattern1(pat3,str3));

    }
}
