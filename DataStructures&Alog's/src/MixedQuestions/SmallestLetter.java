package MixedQuestions;

/**
 * Created by kunal on 3/20/18.
 * Given a list of sorted characters letters containing only lowercase letters, and given a target letter target, find the smallest element in the list that is larger than the given target.

 Letters also wrap around. For example, if the target is target = 'z' and letters = ['a', 'b'], the answer is 'a'.

 Examples:
 Input:
 letters = ["c", "f", "j"]
 target = "a"
 Output: "c"

 Input:
 letters = ["c", "f", "j"]
 target = "c"
 Output: "f"

 Input:
 letters = ["c", "f", "j"]
 target = "d"
 Output: "f"

 Input:
 letters = ["c", "f", "j"]
 target = "g"
 Output: "j"

 Input:
 letters = ["c", "f", "j"]
 target = "j"
 Output: "c"

 Input:
 letters = ["c", "f", "j"]
 target = "k"
 Output: "c"
 Note:
 letters has a length in range [2, 10000].
 letters consists of lowercase letters, and contains at least 2 unique letters.
 target is a lowercase letter.
 */
public class SmallestLetter {

    public char nextGreatestLetter(char[] letters, char target) {

        for(int i=0;i<letters.length;i++){
            char posn =  letters[i];
            if(posn>target) return posn;
        }


        return letters[0];

    }

    public char nextGreatestLetterBinarySearch(char[] letters, char target) {

       int low=0;

        int lo = 0, hi = letters.length;
        while (lo < hi) {
            int mi = lo + (hi - lo) / 2;
            if (letters[mi] <= target) lo = mi + 1;
            else hi = mi;
        }
        return letters[lo % letters.length];

    }

    public static void main(String[] args) {
        SmallestLetter s = new SmallestLetter() ;
        System.out.println(s.nextGreatestLetterBinarySearch(new char[]{'c','f','k'},'h'));
        }

}

