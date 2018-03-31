package MixedQuestions;
import java.util.*;

/**
 * Created by kunal on 2/25/17.
 * Write a function that takes a string as input and reverse only the vowels of a string.

 Example 1:
 Given s = "hello", return "holle".

 Example 2:
 Given s = "leetcode", return "leotcede".


 */


public class ReverseVowels {


    public String reverseVowels(String s) {
        Set<Character> vowelSet = new HashSet<>();
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for (char c : vowels) {
            vowelSet.add(c);
        }

        char[] ch = s.toCharArray();
        int start = 0;
        int end = ch.length - 1;
        while (start < end) {


            while (!vowelSet.contains(ch[start]) && start < end)
                start++;

            while (!vowelSet.contains(ch[end]) && start < end)
                end--;


            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;


        }

        return new String(ch);
    }

    public static void main(String[] args) {
        ReverseVowels v = new ReverseVowels();
        System.out.println(v.reverseVowels("hello"));
    }
}
