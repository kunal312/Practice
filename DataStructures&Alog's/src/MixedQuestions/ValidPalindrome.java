package MixedQuestions;

/**
 * Created by kunal on 2/25/17.
 * 125. Valid Palindrome
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

 For example,
 "A man, a plan, a canal: Panama" is a palindrome.
 "race a car" is not a palindrome.

 Note:
 Have you consider that the string might be empty? This is a good question to ask during an interview.

 For the purpose of this problem, we define empty string as valid palindrome.
 */
public class ValidPalindrome {

    public boolean isPalindrome(String s) {

        if(s.isEmpty())
            return true;


        String str = s.toLowerCase();
        int start =0;
        int end = str.length()-1;
        while(start<end){


            if(!Character.isLetterOrDigit(str.charAt(end)))
            {
                end--;
            } else if(!Character.isLetterOrDigit(str.charAt(start)))
            {
                start++;
            }else{
                if(str.charAt(start) != str.charAt(end))
                    return false;

                start++;
                end--;

            }

        }


        return true;
    }

    public static void main(String[] args){
        ValidPalindrome check = new ValidPalindrome();
        System.out.println(check.isPalindrome("aaabbaa"));
        System.out.println(check.isPalindrome("a..."));
        System.out.println(check.isPalindrome(""));


    }



}
