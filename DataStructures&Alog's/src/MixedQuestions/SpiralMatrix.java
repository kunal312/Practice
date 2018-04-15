package MixedQuestions;
import java.util.*;

/**
 Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

 For example,
 Given the following matrix:

 [
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
 ]
 You should return [1,2,3,6,9,8,7,4,5].
 */

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res  = new ArrayList<>();
        if(matrix==null || matrix.length==0) return res;

        int last_row = matrix.length-1;
        int last_col = matrix[0].length-1;
        int i = 0;
        int l = 0;
        int k=0;
        // int j=0;


        while(k<= last_row && l <= last_col ){

            for(i=l;i<=last_col;i++){
                res.add(matrix[k][i]);
            }
            k++;

            for( i = k;i<=last_row;i++){
                res.add(matrix[i][last_col]);
            }
            last_col--;

            if(k<=last_row){
                for( i=last_col;i>=l;i--){
                    res.add(matrix[last_row][i]);
                }
                last_row--;
            }

            if(l<=last_col){
                for( i=last_row;i>=k;i--){
                    res.add(matrix[i][l]);
                }
                l++;
            }



        }
        return res;

    }

    public static void main(String[] args) {
        int mat[][]={   {10,20,30,40,50,60,},
                        {70,80,90,100,110,120},
                        {130,140,150,160,170,180},};
        SpiralMatrix s = new SpiralMatrix();
        List<Integer> res = s.spiralOrder(mat);
        for(int i=0;i<res.size();i++)
            System.out.println(res.get(i));
    }
}
