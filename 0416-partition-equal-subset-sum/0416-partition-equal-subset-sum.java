class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int n:nums){
            sum+=n;
        }
        if(sum%2!=0) return false;
        sum=sum/2;
        int[][] dp=new int[nums.length][sum+1];
       int y= help(nums,0,sum,dp);
       if(y==1) return true;
       return false;
    }
int help(int[] n,int i,int s,int[][] dp){
    if(s==0) return 1;
    if(i>=n.length) return 2;
    if(dp[i][s]!=0) return dp[i][s];
    if(n[i]<=s){
        int h=help(n,i+1,s-n[i],dp);
        int g=help(n,i+1,s,dp);
        if(h==1&&g==2||h==2&&g==1||h==1&&g==1) dp[i][s]=1;
       else dp[i][s]=2;
    }
    else dp[i][s]= help(n,i+1,s,dp);  
    return dp[i][s];
}
}