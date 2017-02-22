package MixedQuestions;

/**
 * Created by kunal on 2/21/17.
 344. Write a function that takes a string as input and returns the string reversed.

 Example:
 Given s = "hello", return "olleh".
 */
public class ReverseString {
    public String reverseString(String s) {

        char [] character = s.toCharArray();
        int i =0;
        int j= s.length() -1;
        while (i<j) {
            char temp = character[i];
            character[i] = character[j];
            character[j] = temp;
            i++;
            j--;
        }
        return new String(character);
        }


        public static void main(String[] args){
        ReverseString r = new ReverseString();
        System.out.println(r.reverseString("hello"));
            System.out.print(r.reverseString("hell world Alice"));

        }
    }


