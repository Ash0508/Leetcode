class Solution {
    public int maxSubArray(int[] a) {
        int max=a[0];
        int curr=a[0];

        for(int i=1;i<a.length;i++)
        {
            if(a[i]>curr+a[i]) curr=a[i];
            else curr=curr+a[i];
            if(curr>max) max=curr;
        }
        return max;
        
    }
}