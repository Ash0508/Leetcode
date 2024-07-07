class Pair
{
    int row,col,tm;
    Pair(int row,int col,int tm)
    {
        this.row=row;
        this.col=col;
        this.tm=tm;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        Queue<Pair> q=new LinkedList<>();

        int [][] vis=new int[n][m];
        int cntfresh=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==2)
                {
                    q.add(new Pair(i,j,0));
                    vis[i][j]=2;
                }
                else{
                    vis[i][j]=0;
                }
                if(grid[i][j]==1) cntfresh++;
            }
        }

        int tm=0;
        int drow[]={-1,0,+1,0};
        int dcol[]={0,1,0,-1};
        int cnt=0;
        while(!q.isEmpty())
        {
             int ro=q.peek().row;
             int co=q.peek().col;
             int t=q.peek().tm;
             tm=Math.max(tm,t);
             q.remove();

             for(int i=0;i<4;i++)
             {
                int r=ro+drow[i];
                int c=co+dcol[i];

                if(r>=0 && r<n && c<m && c>=0 && vis[r][c] == 0 && grid[r][c]==1)
                {
                    q.add(new Pair(r,c,t+1));
                    vis[r][c]=2;
                    cnt++;
                }
             }
        }
        if(cnt!=cntfresh) return -1;
        return tm;
    }
}