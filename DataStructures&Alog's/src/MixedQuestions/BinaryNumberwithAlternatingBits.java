package MixedQuestions;

/**
 * Created by kunal on 4/8/18.
 * Given a positive integer, check whether it has alternating bits: namely, if two adjacent bits will always have different values.

 Example 1:
 Input: 5
 Output: True
 Explanation:
 The binary representation of 5 is: 101
 Example 2:
 Input: 7
 Output: False
 Explanation:
 The binary representation of 7 is: 111.
 Example 3:
 Input: 11
 Output: False
 Explanation:
 The binary representation of 11 is: 1011.
 Example 4:
 Input: 10
 Output: True
 Explanation:
 The binary representation of 10 is: 1010.
 */
public class BinaryNumberwithAlternatingBits {
    public boolean hasAlternatingBits(int n) {
        if(n==0) return true;
        while(n>0){
            int lastbit=n%2;
            n=n/2;
            int currentbit = n%2;
            if(lastbit==currentbit) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        BinaryNumberwithAlternatingBits b = new BinaryNumberwithAlternatingBits();
        System.out.println(b.hasAlternatingBits(7));
    }

}
