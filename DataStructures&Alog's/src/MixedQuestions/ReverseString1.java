package MixedQuestions;

/**
 * Created by kunal on 2/24/17.
 *For example,
 * 151. Reverse Words in a String
 Given s = "the sky is blue",
 return "blue is sky the".
 */
public class ReverseString1 {

    public String reverseWords(String s) {

        String [] str = s.split("\\s+");
        StringBuilder newString = new StringBuilder();

        for(int i =str.length-1;i>=0;i--){
            newString.append(str[i]);

                if(i!=0)
                newString.append(" ");

        }

        System.out.println(newString);

        return newString.toString();


    }

    public  static void main(String[] args){
        ReverseString1 r = new ReverseString1();
        r.reverseWords("hello world");
        //System.out.println(x);
        //System.out.println(x.length());

        }
}
