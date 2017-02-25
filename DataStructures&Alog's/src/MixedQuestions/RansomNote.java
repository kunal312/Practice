package MixedQuestions;

/**
 * Created by kunal on 2/24/17.
 */
public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {

        int[] arr = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            System.out.println("First loop:"+arr['m'- 'a']);
            arr[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if(--arr[ransomNote.charAt(i)-'a'] < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        RansomNote rn = new RansomNote();
        System.out.println(rn.canConstruct("aa","bb"));
    }
}
