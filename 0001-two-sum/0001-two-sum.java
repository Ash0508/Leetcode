class Solution {
    public int[] twoSum(int[] a, int x) {
        int n=a.length;
    
        int ans[]={-1,-1};
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++)
            {
                if((a[i]+a[j])==x)
                {
                    ans[0]=i;
                    ans[1]=j;
                    break;
                }
            }
        }
        return ans;
        
        
    }
}