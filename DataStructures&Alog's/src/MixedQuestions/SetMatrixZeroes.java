package MixedQuestions;

/**
 * Created by kunal on 4/16/18.
 * Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in place.

 click to show follow up.

 Follow up:
 Did you use extra space?
 A straight forward solution using O(mn) space is probably a bad idea.
 A simple improvement uses O(m + n) space, but still not the best solution.
 Could you devise a constant space solution?


 */
public class SetMatrixZeroes {

    //Time : O(mn) Space : O(1)
    public void setZeroes(int[][] matrix) {
        if(matrix==null || matrix.length<1 || matrix[0].length<1)
            return;

        boolean rowHasZero =false;
        boolean colHasZero = false;

//        //check if 1st row has zero
//        for(int i=0;i<matrix[0].length;i++){
//            if(matrix[0][i]==0){
//                rowHasZero=true;
//                break;
//            }
//        }
//
//        //check if 1st col has zero
//        for(int i=0;i<matrix.length;i++){
//            if(matrix[i][0]==0){
//                colHasZero=true;
//                break;
//            }
//        }
//
//        //scan all the elemnts and check if there is 0 if 0 exists set corresponding row and column first to 0
//        for(int i=1;i<matrix.length;i++)
//            for(int j=1;j<matrix[i].length;j++){
//                if(matrix[i][j]==0){
//                    matrix[i][0]=0;
//                    matrix[0][j]=0;
//                }
//            }


        //The above 3 can combine in one loop by checking i==0 and j==0 i.e if first row or column is 0 set the flags to true and for other rows set corresponding first row /col to 0
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    if(i==0) rowHasZero=true;
                    if(j==0) colHasZero=true;
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }

        //Now we will nullify all rows and columns for the elements which has first row or column element has zero.

        //Nullify rows and columns
        for(int i=1;i<matrix.length;i++)
            for(int j=1;j<matrix[0].length;j++){
                //only check 1st element of row or column if that is 0 set that row or col to 0 since we have marked in our                         previous step
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }

        if(rowHasZero){
            for(int j=0;j<matrix[0].length;j++)
                matrix[0][j]=0;
        }

        if(colHasZero){
            for(int i=0;i<matrix.length;i++)
                matrix[i][0]=0;
        }


    }
}
