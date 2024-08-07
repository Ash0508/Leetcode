class Solution {
    public int dpFunc(int[] arr, int ind, int prev_ind, int[] dp){
        if(ind == arr.length) return 0;
        if(dp[prev_ind+1] != -1) return dp[prev_ind+1];

        int notTake = 0 + dpFunc(arr,ind+1,prev_ind,dp);

        int take = 0;
        if(prev_ind == -1 || arr[ind] > arr[prev_ind]){
            take = 1 + dpFunc(arr,ind+1,ind,dp);
        }

        dp[prev_ind+1] = Math.max(take,notTake);
        return dp[prev_ind+1];
    }

    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return dpFunc(nums,0,-1,dp);
    }
}
