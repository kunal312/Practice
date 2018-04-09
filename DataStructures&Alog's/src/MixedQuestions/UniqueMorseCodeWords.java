package MixedQuestions;

import java.util.HashSet;

/**
 * Created by kunal on 4/8/18.
 * International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows: "a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and so on.

 For convenience, the full table for the 26 letters of the English alphabet is given below:

 [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
 Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter. For example, "cab" can be written as "-.-.-....-", (which is the concatenation "-.-." + "-..." + ".-"). We'll call such a concatenation, the transformation of a word.

 Return the number of different transformations among all words we have.

 Example:
 Input: words = ["gin", "zen", "gig", "msg"]
 Output: 2
 Explanation:
 The transformation of each word is:
 "gin" -> "--...-."
 "zen" -> "--...-."
 "gig" -> "--...--."
 "msg" -> "--...--."

 There are 2 different transformations, "--...-." and "--...--.".


 Note:

 The length of words will be at most 100.
 Each words[i] will have length in range [1, 12].
 words[i] will only consist of lowercase letters.

 */
public class UniqueMorseCodeWords {
    public int uniqueMorseRepresentations(String[] words) {

        if(words.length==0) return 0;

        String [] morseCodes =  {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        HashSet<String> set = new HashSet<>();
        for(String word:words){
            StringBuilder str = new StringBuilder();
            char[] cha = word.toCharArray();
            for(char c:cha){
                str.append(morseCodes[c-'a']);
            }
            set.add(str.toString());
        }

        return set.size();
    }

    public static void main(String[] args) {
        UniqueMorseCodeWords u = new UniqueMorseCodeWords();
        System.out.println(u.uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"}));
    }
}
