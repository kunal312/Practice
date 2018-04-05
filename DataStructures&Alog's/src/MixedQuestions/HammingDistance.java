package MixedQuestions;

/**
 * Created by kunal on 4/4/18.
 */
public class HammingDistance {

    public int hammingDistance(int x, int y) {

        //Get all the bits which are different using xor
        int xor = x^y;
        int count=0;
        while(xor>0) {
            //check if last bit is 1 by masking it with 1
            int maskNum = xor & 1;
            if(maskNum!=0) count++;

            //shift bit by 1 bring next bit to last
            xor = xor>>1;
        }
        return count;
    }

    public static void main(String[] args) {
        HammingDistance h = new HammingDistance();
        System.out.println(h.hammingDistance(4,1));

        }
    }

