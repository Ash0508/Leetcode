class Solution {

     public boolean isvalid(char[][] a,int r,int c,char n)
    {
        for(int j=0;j<9;j++)
        {
        if(a[r][j]==n) return false;
        }
         for(int i=0;i<9;i++)
        {
        if(a[i][c]==n) return false;
        }
        // 3*3 grid
        int srow=r/3*3;
        int scol=c/3*3;

        for(int i=srow;i<srow+3;i++)
        {
            for(int j=scol;j<scol+3;j++)
            {
                if(a[i][j]==n) return false;
            }
        }
        return true;

    }



    public void solve(char[][] b,int r,int c,char[][] grid)
    {
        if(r==9)
        {
            for(int i=0;i<9;i++)
            {
                for(int j=0;j<9;j++)
                {
                    grid[i][j]=b[i][j];
                }
            }
            return;
        }
       else if(b[r][c]!='.'){
            if(c!=8) solve(b,r,c+1,grid);
            else solve(b,r+1,0,grid);
        }
        else{
            for(char ch='1';ch<='9';ch++)
            {
                if(isvalid(b,r,c,ch))
                {
                    b[r][c]=ch;
                     if(c!=8) solve(b,r,c+1,grid);
                    else solve(b,r+1,0,grid);
                    b[r][c]='.';
                }
            }
        }
    }
    public void solveSudoku(char[][] a) {
        char[][] grid=new char[9][9];
        solve(a,0,0,grid); 
         for(int i=0;i<9;i++)
            {
                for(int j=0;j<9;j++)
                {
                    a[i][j]=grid[i][j];
                }
            }      
    }
}