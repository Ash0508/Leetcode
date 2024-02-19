class Solution {
    public int[] maxSlidingWindow(int[] a, int k) {
        int n=a.length;
        Stack<Integer> st=new Stack<>();
        int ans[]=new int[n-k+1];
        int z=0;
        int nge[]=new int[n];
        st.push(n-1);
        nge[n-1]=n;
        for(int i=n-2;i>=0;i--)
        {
            while(st.size()>0 && a[i]>a[st.peek()]) st.pop();
            if(st.size()==0) nge[i] = n;
            else nge[i]=st.peek();
            st.push(i);
        }
        
        
        for(int i=0;i<n-k+1;i++)
        {
            int j=i;
            int max=Integer.MIN_VALUE;
            while(j<i+k)
            {
                max=a[j];
                j=nge[j];
            }
            ans[z++]=max;
        }
        return ans;
        
        
    }
}