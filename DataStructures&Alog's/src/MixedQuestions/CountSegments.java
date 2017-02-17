package MixedQuestions;

/**
 * Created by kunal on 2/16/17.
 */


/*434. Number of Segments in a String
        Count the number of segments in a string, where a segment is defined to be a contiguous sequence of non-space characters.

        Please note that the string does not contain any non-printable characters.
        Input: "Hello, my name is John"
        Output: 5*/


public class CountSegments {

    public int cntSegments(String s){
        int count=0;
        if(s.isEmpty()){
            return count;
        }

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' ' && (i==0 || s.charAt(i-1)==' '))
                count++;
        }
       return count;

    }

    public static void main(String[] args){

        CountSegments s = new CountSegments();
         System.out.println("No of Segments: "+s.cntSegments("   My name     is Alex"));
        System.out.println("No of Segments: "+s.cntSegments("     "));
        System.out.println("No of Segments: "+s.cntSegments(" y nam      "));


    }



}
