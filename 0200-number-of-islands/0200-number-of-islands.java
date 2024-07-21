class Solution {
    boolean[][] flag;
    public int numIslands(char[][] grid) {
        int height = grid.length;
        int width = grid[0].length;
        int n=0;
        flag = new boolean[height][width];
        for(int i=0; i<height; i++){
            for(int j=0; j<width;j++){
                if(grid[i][j] == '1' && !flag[i][j]){
                    flag[i][j] = true;
                    ++n;
                    helper(grid,i,j);
                }
            }
        }
        return n;
    }
    private void helper(char[][] grid, int row, int cols){
        int rowdir[] = {-1,1,0,0};
        int coldir[] = {0,0,-1,1};
        for(int i=0; i<4; i++){
            int newrow = row+rowdir[i];
            int newcol = cols + coldir[i];
            if(newrow>-1 && newrow<grid.length && newcol>-1 && newcol<grid[0].length && grid[newrow][newcol]=='1' && !flag[newrow][newcol]){
                flag[newrow][newcol] = true;
                helper(grid,newrow,newcol);
            }
        } 
        return;
    }
}