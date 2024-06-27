class Solution {
    public int findCenter(int[][] e) {
        int n=e.length+1;
        int []degree=new int[n+1];

        for(int [] edge:e)
        {
            degree[edge[0]]++;
            degree[edge[1]]++;
        }

        for(int i=1;i<=n;i++)
        {
            if(degree[i]==n-1) return i;
        }
        return -1;
    }
}