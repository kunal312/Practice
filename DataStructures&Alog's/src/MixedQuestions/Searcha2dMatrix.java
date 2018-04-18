package MixedQuestions;

/**
 * Created by kunal on 4/17/18.
 * Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

 Integers in each row are sorted from left to right.
 The first integer of each row is greater than the last integer of the previous row.
 Example 1:

 Input:
 matrix = [
 [1,   3,  5,  7],
 [10, 11, 16, 20],
 [23, 30, 34, 50]
 ]
 target = 3
 Output: true
 Example 2:

 Input:
 matrix = [
 [1,   3,  5,  7],
 [10, 11, 16, 20],
 [23, 30, 34, 50]
 ]
 target = 13
 Output: false
 */
public class Searcha2dMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {

        if(matrix == null || matrix.length==0 || matrix[0].length ==0) return false;

        int m =matrix.length;
        int n = matrix[0].length;
        int start = 0;
        int end = m*n-1;

        while(start<=end){
            int mid = start +(end-start)/2;

            int midX = mid/n;

            int midY = mid%n;

            if(matrix[midX][midY]==target)
                return true;
            else if(matrix[midX][midY]<target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }

        return false;


        //Approach start row form 0 and column from end. check if matrix of rowcol <target,row++ else column--

//         if(matrix==null || matrix.length<1 || matrix[0].length<1) return false;
//         int row = 0;
//         int column =  matrix[0].length-1;

//         while(row<=matrix.length-1 && column>=0){
//                 if(matrix[row][column]==target) return true;
//                 if(matrix[row][column]<target) row++;
//                 else  if(matrix[row][column]>target) column--;
//         }



//         return false;
    }

    public static void main(String[] args) {
        Searcha2dMatrix s = new Searcha2dMatrix();
        int mat[][]={{1,   3,  5,  7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}};
        System.out.println(s.searchMatrix(mat,16));
        System.out.println(s.searchMatrix(mat,17));
    }


}
