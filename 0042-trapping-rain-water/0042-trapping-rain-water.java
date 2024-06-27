class Solution {
    public int trap(int[] h) {
        int n=h.length;
        if(n==0) return 0;

        int left[]=new int[n];
        int right[]=new int[n];
        int store=0;

        left[0]=h[0];
        for(int i=1;i<n;i++)
        {
            left[i]=Math.max(left[i-1],h[i]);
        }

        right[n-1]=h[n-1];
        for(int i=n-2;i>=0;i--)
        {
            right[i]=Math.max(right[i+1],h[i]);
        }

        for(int i=0;i<n;i++)
        {
            int min=Math.min(left[i],right[i]);
            store+=min-h[i];
        }
            return store;
    }
}