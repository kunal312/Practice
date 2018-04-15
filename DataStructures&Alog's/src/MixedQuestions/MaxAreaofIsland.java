package MixedQuestions;

/**
 * Created by kunal on 4/14/18.
 * Given a non-empty 2D array grid of 0's and 1's, an island is a group of 1's (representing land) connected 4-directionally (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water.

 Find the maximum area of an island in the given 2D array. (If there is no island, the maximum area is 0.)

 Example 1:
 [[0,0,1,0,0,0,0,1,0,0,0,0,0],
 [0,0,0,0,0,0,0,1,1,1,0,0,0],
 [0,1,1,0,1,0,0,0,0,0,0,0,0],
 [0,1,0,0,1,1,0,0,1,0,1,0,0],
 [0,1,0,0,1,1,0,0,1,1,1,0,0],
 [0,0,0,0,0,0,0,0,0,0,1,0,0],
 [0,0,0,0,0,0,0,1,1,1,0,0,0],
 [0,0,0,0,0,0,0,1,1,0,0,0,0]]
 Given the above grid, return 6. Note the answer is not 11, because the island must be connected 4-directionally.
 Example 2:
 [[0,0,0,0,0,0,0,0]]
 Given the above grid, return 0.
 Note: The length of each dimension in the given grid does not exceed 50.
 */
public class MaxAreaofIsland {

/*Approach: for every 1 , calculate recursively its horizontal and vertical 1's.
    If you have seen that box before mark visited it as true to skip it next time.
    If that box is 0 return 0

* Time Complexity : O(mn) where m = rows and n = columns
* Space Complexity : O(mn) where m = rows and n = columns to store true in visited array and space used by recursion on stack
*
* */
    boolean visited[][];
    public int maxAreaOfIsland(int[][] grid) {
        if(grid==null || grid.length==0 || grid[0].length==0) return 0;
        int res =0;
        visited = new boolean[grid.length][grid[0].length];
        for(int row=0;row<grid.length;row++)
            for(int column=0;column<grid[0].length;column++){
            res =Math.max(res,getArea(grid,row,column));
            }

        return res;
    }

    private int getArea(int [][]grid,int row,int column){
        if(row<0 || row>=grid.length || column<0||column>=grid[0].length ||  grid[row][column]==0)
            return 0;
        if(visited[row][column])
            return 0;

        visited[row][column]=true;
        int area = 1+ getArea(grid,row,column+1)+getArea(grid,row,column-1)+getArea(grid,row+1,column)+getArea(grid,row-1,column);

        return area;

    }


    public static void main(String[] args) {
        MaxAreaofIsland i = new MaxAreaofIsland();
        int mat[][]={   {0,0,1,0,0,0,0,1,0,0,0,0,0},
                        {0,0,0,0,0,0,0,1,1,1,0,0,0},
                        {0,1,1,0,1,0,0,0,0,0,0,0,0},
                        {0,1,0,0,1,1,0,0,1,0,1,0,0},
                        {0,1,0,0,1,1,0,0,1,1,1,0,0},
                        {0,0,0,0,0,0,0,0,0,0,1,0,0},
                        {0,0,0,0,0,0,0,1,1,1,0,0,0},
                        {0,0,0,0,0,0,0,1,1,0,0,0,0}};

        System.out.println(i.maxAreaOfIsland(mat));
    }


}
