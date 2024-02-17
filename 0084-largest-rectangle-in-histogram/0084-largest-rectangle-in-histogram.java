class Solution {
    public int largestRectangleArea(int[] h) {
        int n=h.length;
        Stack<Integer> st=new Stack<>();
        int nse[]=new int[n];
        int pse[]=new int [n];
        
        st.push(n-1);
        nse[n-1]=n;
        
        for(int i=n-2;i>=0;i--)
        {
            while(st.size()>0 && h[st.peek()]>=h[i])
                st.pop();
            if(st.size()==0) nse[i]=n;
            else nse[i]=st.peek();
            st.push(i);
        }
        
        while(st.size()>0) st.pop();
        
        st.push(0);
        pse[0]=-1;
        for(int i=1;i<=n-1;i++)
        {
            while(st.size()>0 && h[st.peek()]>=h[i])
                st.pop();
            if(st.size()==0) pse[i]=-1;
            else pse[i]=st.peek();
             st.push(i);
        }
        
        int max=-1;
        int area;
        for(int i=0;i<n;i++)
        {
           area=h[i]*(nse[i]-pse[i]-1);
            max=Math.max(max,area);
        }
        
        return max;
        
    }
}