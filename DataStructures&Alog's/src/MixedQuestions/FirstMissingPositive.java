package MixedQuestions;

/**
 * Created by kunal on 3/16/18.
 */
public class FirstMissingPositive {

    /*
    * Approach: To place all the positive integers at their correct indices.
    * We start iterating array
    * Check if number is already at its correct position in that case i++
    *If number is not at its correct position
    *   check if it is less than 0 or greater than length(coz we only care about 1,n) in that case we break out and i++
    *   if not then check if number is not duplicate with the position we are going to swap, if it is break
    *
    *  otherwise
    *  keep on swapping
    *
    * Finally all the positive integers will be at its correct position we iterate and return the index of whichever numbe ris not present,
    *
    * Time Complexity: O(n) since we will be swapping in place and breaking out
    * Space Complexity: O(1)
    * */

    public int firstMissingPositive(int[] A) {

        int length = A.length;

        for(int i=0;i<length;i++){

            //Enter the loop if number is at not correct position
            while(A[i]!=i+1){
                //should be in range(1,length)
                if(A[i]<=0 || A[i]>=length) break;

                //TO avoid duplicates otherwise it will be in loop since we are finding correct index
                if(A[i]==A[A[i]-1]) break;

                //Else Swap to its correct location
                int temp = A[i];
                A[i] = A[temp-1];
                A[temp-1] = temp;
            }
        }

        for(int i=0;i<length;i++){
            if(A[i]!=i+1) return i+1;
        }


        return length;


    }




    public static void main(String[] args) {

        FirstMissingPositive m = new FirstMissingPositive();
        System.out.println("First Positive:"+m.firstMissingPositive(new int[]{-1,-1}));

    }


}
