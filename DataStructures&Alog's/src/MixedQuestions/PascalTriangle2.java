package MixedQuestions;
import java.util.*;
/**
 * Created by kunal on 4/2/18.
 * Given an index k, return the kth row of the Pascal's triangle.

 For example, given k = 3,
 Return [1,3,3,1].

 Note:
 Could you optimize your algorithm to use only O(k) extra space?
 */
public class PascalTriangle2 {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> r = new ArrayList<>();
        r.add(1);
        for(int i=1;i<rowIndex+1;i++){
            for(int j=1;j<=i;j++){
                r.set(j,r.get(j)+r.get(j+1));
            }
            r.add(1);
        }

        return r;


    }


    public static void main(String[] args) {

        PascalTriangle2 p = new PascalTriangle2();
        p.getRow(4);

    }

}
