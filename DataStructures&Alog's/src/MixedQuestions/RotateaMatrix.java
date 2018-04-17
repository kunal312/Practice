package MixedQuestions;

/**
 * Created by kunal on 4/15/18.
 *
 Premium
 New Playground
 kunal312

 48. Rotate Image
 DescriptionHintsSubmissionsDiscussSolution
 You are given an n x n 2D matrix representing an image.

 Rotate the image by 90 degrees (clockwise).

 Note:

 You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

 Example 1:

 Given input matrix =
 [
 [1,2,3],
 [4,5,6],
 [7,8,9]
 ],

 rotate the input matrix in-place such that it becomes:
 [
 [7,4,1],
 [8,5,2],
 [9,6,3]
 ]
 Example 2:

 Given input matrix =
 [
 [ 5, 1, 9,11],
 [ 2, 4, 8,10],
 [13, 3, 6, 7],
 [15,14,12,16]
 ],

 rotate the input matrix in-place such that it becomes:
 [
 [15,13, 2, 5],
 [14, 3, 4, 1],
 [12, 6, 8, 9],
 [16, 7,10,11]
 ]
 */
public class RotateaMatrix {

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int layer = 0; layer < n / 2; layer++) {
            int first = layer;
            int last = n - layer - 1;
            for (int i = first; i < last; i++) {
                int offset = i - first;
                //Save Top
                int top = matrix[first][i];
                //left-top
                matrix[first][i] = matrix[last - offset][first];
                //bottom-left
                matrix[last - offset][first] = matrix[last][last - offset];
                //right-bottm
                matrix[last][last - offset] = matrix[i][last];
                //top-right
                matrix[i][last] = top;
            }
        }
    }

    public static void main(String[] args) {
        RotateaMatrix r = new RotateaMatrix();
        int a[][]= {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        r.rotate(a);
    }
}


