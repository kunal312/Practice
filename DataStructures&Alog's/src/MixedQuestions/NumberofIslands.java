package MixedQuestions;

/**
 * Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

 Example 1:

 11110
 11010
 11000
 00000
 Answer: 1

 Example 2:

 11000
 11000
 00100
 00011
 Answer: 3


 */
public class NumberofIslands {
    boolean visited[][];
    public int numIslands(char[][] grid) {

        if(grid==null || grid.length==0 || grid[0].length==0) return 0;

        int res =0;
        visited = new boolean[grid.length][grid[0].length];
        for(int row=0;row<grid.length;row++)
            for(int column=0;column<grid[0].length;column++){
                if(grid[row][column]=='1' && !visited[row][column] ){
                    res++;
                    getArea(grid,row,column);
                }
            }

        return res;

    }

    private void getArea(char [][]grid,int row,int column){

        if(row<0 || row>=grid.length || column<0||column>=grid[0].length ||  grid[row][column]=='0')
            return;
        if(visited[row][column])
            return;
        visited[row][column]=true;
        getArea(grid,row,column+1);
        getArea(grid,row,column-1);
        getArea(grid,row+1,column);
        getArea(grid,row-1,column);


    }

    public static void main(String[] args) {
        NumberofIslands n = new NumberofIslands();
        char mat[][]={{'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}};

        System.out.println(n.numIslands(mat));
    }
}
