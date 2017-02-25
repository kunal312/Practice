package MixedQuestions;

/**
 * Created by kunal on 2/24/17.
 520 Detect Capital
 Given a word, you need to judge whether the usage of capitals in it is right or not.

 We define the usage of capitals in a word to be right when one of the following cases holds:

 All letters in this word are capitals, like "USA".
 All letters in this word are not capitals, like "leetcode".
 Only the first letter in this word is capital if it has more than one letter, like "Google".
 Otherwise, we define that this word doesn't use capitals in a right way.
 */
public class DetectCapital {

    public boolean detectCapitalUse(String word) {

        if(word.equals(word.toLowerCase()))
            return true;
        if(word.equals(word.toUpperCase()))
            return true;
        if(word.substring(1).toLowerCase().equals(word.substring(1))&& Character.isUpperCase(word.charAt(0)) )
            return true;

        return false;

      


    }

    public static void main(String[] args){
        DetectCapital det = new DetectCapital();
        System.out.println(det.detectCapitalUse("USA"));
        System.out.println(det.detectCapitalUse("Usa"));
        System.out.println(det.detectCapitalUse("usa"));
        System.out.println(det.detectCapitalUse("UsA"));

    }
}
