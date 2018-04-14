package MixedQuestions;

/**
 * Created by kunal on 4/14/18.
 * You are given a map in form of a two-dimensional integer grid where 1 represents land and 0 represents water. Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells). The island doesn't have "lakes" (water inside that isn't connected to the water around the island). One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.

 Example:

 [[0,1,0,0],
 [1,1,1,0],
 [0,1,0,0],
 [1,1,0,0]]

 Answer: 16
 */
public class IslandPerimeter {

    //COmplexity =O(mn)
    /*Check every row column if 1 increment the island counter.
            If it is an island we need to check that right column is not 1 if so we increment the neigbhors count
             If it is an island we also need to check the bottm row is 1 if so we increment the neighbors count
      Finally result wil be 4 * island(that is 1's) - 2*(neighbors)
    * */
    public int islandPerimeter(int[][] grid) {
        if(grid==null || grid.length == 0) return 0;

        int island =0;
        int neighbors = 0;
        for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1) island++;
                else continue;
                if(i<grid.length-1 && grid[i+1][j]==1) neighbors++;
                if(j<grid[i].length-1 && grid[i][j+1]==1) neighbors++;
            }

        int total1s = 4*island;
        int common1s=2*neighbors;
        int result = total1s-common1s;

        return result;
    }

    public static void main(String[] args) {

        IslandPerimeter p = new IslandPerimeter();
        int a[][]= {{0,1,0,0},
                    {1,1,1,0},
                    {0,1,0,0},
                    {1,1,0,0}};
        System.out.println(p.islandPerimeter(a));
    }
}
