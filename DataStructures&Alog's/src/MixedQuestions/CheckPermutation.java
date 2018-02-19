package MixedQuestions;

/**
 * Created by kunal on 2/18/18.
 */
//Given two strings check if one is permutation of other..similar to valid anagrams
    //Assumptions : space is significant and ascii
public class CheckPermutation {

    boolean isPermutation(String s, String t){

        if(s.length()!=t.length())
            return false;

        int[] letters = new int[128];
        char[] sArray = s.toCharArray();
        for(char c:sArray){
            letters[c]++;
        }

        for(int i =0;i<t.length();i++){
            char c1 = t.charAt(i);
            letters[c1]--;
            if(letters[c1]<0)
                return false;
        }
        return true;
    }

    //Another way to solve sort and compare with equals.

    public static void main(String[] args) {
        CheckPermutation pm = new CheckPermutation();
        System.out.println(pm.isPermutation("a","a"));
    }

}
