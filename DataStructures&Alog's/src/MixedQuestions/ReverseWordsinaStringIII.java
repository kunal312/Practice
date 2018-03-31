package MixedQuestions;

/**
 * Created by kunal on 3/31/18.
 * Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

 Example 1:
 Input: "Let's take LeetCode contest"
 Output: "s'teL ekat edoCteeL tsetnoc"
 Note: In the string, each word is separated by single space and there will not be any extra space in the string.


 */
public class ReverseWordsinaStringIII {

    public String reverseWords(String s) {

        if(s.isEmpty()) return "";
        String str [] = s.split(" ");
        StringBuilder res = new StringBuilder("");
        for(int i=0;i<str.length;i++){
            res.append(swapChar(str[i]));
            if(i!=str.length-1){
                res.append(" ");
            }

        }
        return res.toString();
    }

    private String swapChar(String  s){
        char [] ch = s.toCharArray();
        int start =0;
        int end=ch.length-1;
        while(start<end){
            char temp =ch[start];
            ch[start]=ch[end];
            ch[end] =temp;
            start++;
            end--;
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        ReverseWordsinaStringIII r = new ReverseWordsinaStringIII();
        System.out.println(r.reverseWords("Let's take LeetCode contest"));
    }

}
