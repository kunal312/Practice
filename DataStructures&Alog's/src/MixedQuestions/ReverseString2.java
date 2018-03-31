package MixedQuestions;

/**
 * Created by kunal on 3/31/18.
 * Given a string and an integer k, you need to reverse the first k characters for every 2k characters counting from the start of the string. If there are less than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and left the other as original.
 Example:
 Input: s = "abcdefg", k = 2
 Output: "bacdfeg"
 Restrictions:
 The string consists of lower English letters only.
 Length of the given string and k will in the range [1, 10000]
 */
public class ReverseString2 {
    public String reverseStr(String s, int k) {
        if(k==0) return s;
        char [] ch=  s.toCharArray();
        int i=0;
        while(i<ch.length){
           int j = Math.min(i+k-1,ch.length-1);
           swapChar(ch,i,j);
           i+=2*k;
        }

        return new String(ch);
    }

    private void swapChar(char []ch,int i,int j){
       while(i<j){
           char temp = ch[i];
           ch[i]=ch[j];
           ch[j]=temp;
           i++;
           j--;
       }

    }

    public static void main(String[] args) {
        ReverseString2 r = new ReverseString2();
        System.out.println(r.reverseStr("abcd",2));
    }


}
