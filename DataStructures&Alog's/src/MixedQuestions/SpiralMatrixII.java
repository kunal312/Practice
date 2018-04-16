package MixedQuestions;

/**
 * Created by kunal on 4/15/18.
 * Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.

 For example,
 Given n = 3,

 You should return the following matrix:

 [
 [ 1, 2, 3 ],
 [ 8, 9, 4 ],
 [ 7, 6, 5 ]
 ]
 */
public class SpiralMatrixII {
    public int[][] generateMatrix(int n) {
        int [][]matrix = new int[n][n];
        int lastRow= n-1;
        int lastCol= n-1;
        int i=0;
        int k=0;
        int l=0;
        int elements=1;
        while(k<=lastRow  && l <=lastCol){
            //Print 1st Row
            for(i=l;i<=lastCol;i++){
                matrix[k][i]=elements;
                elements++;
            }
            k++;

            for(i=k;i<=lastRow;i++){
                matrix[i][lastCol]=elements;
                elements++;
            }
            lastCol--;

            if(k<=lastRow){
                for(i=lastCol;i>=l;i--){
                    matrix[lastRow][i]=elements;
                    elements++;
                }
                lastRow--;
            }

            if(l<=lastCol){
                for( i=lastRow;i>=k;i-- ){
                    matrix[i][l]=elements;
                    elements++;
                }
                l++;
            }

        }
        return matrix;

    }

    public static void main(String[] args) {
        SpiralMatrixII s = new SpiralMatrixII();
        s.generateMatrix(3);
    }
}
