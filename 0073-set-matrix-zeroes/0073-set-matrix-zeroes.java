class Solution {
    public void setZeroes(int[][] a) {
        int n=a.length;
        int m=a[0].length;
        boolean r=false,c=false;

        for(int i=0;i<n;i++)
        {
            if(a[i][0]==0) c=true;
        }
          for(int i=0;i<m;i++)
        {
            if(a[0][i]==0) r=true;
        }

        for(int i=1;i<n;i++)
        {
            for(int j=1;j<m;j++)
            {
                if(a[i][j]==0)
                {
                    a[i][0]=a[0][j]=0;
                }
            }
        }
          for(int i=1;i<n;i++)
        {
            for(int j=1;j<m;j++)
            {
                if(a[i][0]==0 || a[0][j]==0)
                {
                    a[i][j]=0;
                }
            }
        }
        if(r)
        {
            for(int i=0;i<m;i++)
            {
                a[0][i]=0;
            }
        }
         if(c)
        {
            for(int i=0;i<n;i++)
            {
                a[i][0]=0;
            }
        }
        
    }
}