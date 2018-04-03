package MixedQuestions;

/**
 * Created by kunal on 4/2/18.
 * You are given a string representing an attendance record for a student. The record only contains the following three characters:
 'A' : Absent.
 'L' : Late.
 'P' : Present.
 A student could be rewarded if his attendance record doesn't contain more than one 'A' (absent) or more than two continuous 'L' (late).

 You need to return whether the student could be rewarded according to his attendance record.

 Example 1:
 Input: "PPALLP"
 Output: True
 Example 2:
 Input: "PPALLL"
 Output: False
 */
public class StudentRecord {

    public boolean checkRecord(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A') count++;
            else if(s.charAt(i)=='L'){
                if((i > 0 && s.charAt(i-1)=='L') && ( i<s.length()-1 && s.charAt(i+1)=='L'))
                    return false;
            }
            if(count>1){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        StudentRecord r = new StudentRecord();

        System.out.println( r.checkRecord("PPALLP"));
    }
}
