package MixedQuestions;

/**
 * Created by kunal on 2/7/18.
 */
public class isAnagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args){

        isAnagram an = new isAnagram();
        System.out.println(an.isAnagram("rat","tar"));



    }
}
