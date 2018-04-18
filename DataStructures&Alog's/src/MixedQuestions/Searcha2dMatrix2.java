package MixedQuestions;

/**
 * Created by kunal on 4/17/18.
 */
public class Searcha2dMatrix2 {

    public boolean searchMatrix(int[][] matrix, int target) {

        if(matrix==null || matrix.length==0) return false;

        int row = 0;
        int column=matrix[0].length-1;
        while(row<matrix.length && column>=0){
            int element = matrix[row][column];
            if(element<target) row++;
            else if(element>target) column--;
            else return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Searcha2dMatrix2 s = new Searcha2dMatrix2();
        int mat[][]={{1,   4,  7, 11, 15},
                     {2,   5,  8, 12, 19},
                     {3,   6,  9, 16, 22}};

        System.out.println(s.searchMatrix(mat,12));
        System.out.println(s.searchMatrix(mat,17));
    }
}
