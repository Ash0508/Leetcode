// class Solution {
//     public void setZeroes(int[][] a) {
//         int n=a.length;
//         int m=a[0].length;
//         for(int i=0;i<n;i++)
//         {
//             for(int j=0;j<m;j++)
//             {
//                 if(a[i][j]==0)
//                 {
//                    setminus(a,i,j);
//                 }
//             }
//         }
        
//         for(int i=0;i<a.length;i++)
//         {
//             for(int j=0;j<a[0].length;j++)
//             {
//                 if(a[i][j]==-1) a[i][j]=0;
//             }
//         }
        
//     }
//     public void setminus(int a[][],int col,int row)
//     {
//         for(int i=0;i<a.length;i++)
//         {
//             if(a[i][row]!=0) a[i][row]=-1;
//         }
//         for(int i=0;i<a[0].length;i++)
//         {
//             if(a[col][i]!=0) a[col][i]=-1;
//         }
//     }
// }


class Solution {
    public void setZeroes(int[][] a) {
        boolean r=false,c=false;
        
        int n=a.length , m=a[0].length;
        
        for(int i=0;i<n;i++) { if(a[i][0]==0) c=true;}
        for(int j=0;j<m;j++) { if(a[0][j]==0) r=true;}
        
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<m;j++)
            {
                if(a[i][j]==0) a[i][0]=a[0][j]=0;
            }
        }
        
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<m;j++)
            {
                if(a[i][0]==0 || a[0][j]==0)  a[i][j]=0;
            }
        }
        
        if(r)
        {
           for(int j=0;j<m;j++) a[0][j]=0; 
        }
        if(c)
        {
            for(int i=0;i<n;i++) a[i][0]=0;
        }
    }
}