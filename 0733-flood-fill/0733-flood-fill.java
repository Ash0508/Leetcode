class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int ini=image[sr][sc];
        int ans[][]=image;
        int delr[]={-1,0,1,0};
        int delc[]={0,1,0,-1};
        dfs(sr,sc,ans,image,color,delr,delc,ini);
        return ans;
    }

    public void dfs(int ro,int co,int [][] ans,int [][] image,int color,int delr[],int delc[],int ini)
    {
        ans[ro][co]=color;
        int n=image.length;
        int m=image[0].length;
        for(int i=0;i<4;i++)
        {
            int r=ro+delr[i];
            int c=co+delc[i];
            if(r>=0 && r<n && c>=0 && c<m && image[r][c]==ini && ans[r][c]!=color)
            dfs(r,c,ans,image,color,delr,delc,ini);
        }
    }
}