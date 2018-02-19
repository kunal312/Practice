package MixedQuestions;

/**
 * Created by kunal on 2/25/17.
 * 58. Length of Last Word
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

 If the last word does not exist, return 0.

 Note: A word is defined as a character sequence consists of non-space characters only.

 For example,
 Given s = "Hello World",
 return 5.
 */
public class LengthofLastWord {

    public int lengthOfLastWord(String s) {
        return s.trim().length()-s.trim().lastIndexOf(" ")-1;

    }

    //method2
  /*  public int lengthOfLastWord(String s) {

        if(s.isEmpty()){
            return 0;
        }

        int count = 0;
        String s1 = s.trim();
        int size =s1.length()-1;
        for(int i=size; i>=0; i--)
        {

            if(!Character.isSpaceChar(s1.charAt(i)))
            {
                count++;
                System.out.println("Count:"+count);
            }
            else{
                break;
            }



        }

        return count;
    }*/

    public static void main(String[] args){
        LengthofLastWord l = new LengthofLastWord();
        System.out.println(l.lengthOfLastWord(" a"));
        System.out.println(l.lengthOfLastWord(" a"));
        System.out.println(l.lengthOfLastWord(" abbb"));
        System.out.println(l.lengthOfLastWord(" aaga  "));
    }
}
