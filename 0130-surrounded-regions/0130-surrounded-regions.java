class Solution {
    public void solve(char[][] b) {
        int n=b.length;
        int m=b[0].length;

        int vis[][]=new int[n][m];
        int delr[]={-1,0,1,0};
        int delc[]={0,1,0,-1};

        for(int i=0;i<n;i++)
        {
            if(vis[i][0]==0 && b[i][0]=='O')
            dfs(i,0,vis,b,delr,delc);
            if(vis[i][m-1]==0 && b[i][m-1]=='O')
            dfs(i,m-1,vis,b,delr,delc);
        }

        for(int j=0;j<m;j++)
        {
            if(vis[0][j]==0 && b[0][j]=='O')
            dfs(0,j,vis,b,delr,delc);
            if(vis[n-1][j]==0 && b[n-1][j]=='O')
            dfs(n-1,j,vis,b,delr,delc);
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(vis[i][j]==0 && b[i][j]=='O')
                b[i][j]='X';
            }
        }
        
    }
    public void dfs(int ro,int co,int vis[][],char b[][],int delr[],int delc[])
    {
        vis[ro][co]=1;
        int n=b.length;
        int m=b[0].length;

        for(int i=0;i<4;i++)
        {
            int r=ro+delr[i];
            int c=co+delc[i];

            if(r>=0 && r<n && c>=0 && c<m && vis[r][c]==0 && b[r][c]=='O')
            dfs(r,c,vis,b,delr,delc);
        }
    }
}