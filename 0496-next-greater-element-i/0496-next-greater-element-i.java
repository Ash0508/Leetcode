class Solution {
    public int[] nextGreaterElement(int[] n1, int[] n2) {
        int nge[]=new int[n2.length];
        Stack<Integer> st=new Stack();
        for(int i=n2.length-1;i>=0;i--)
        {
            while(st.size()>0 && st.peek()<n2[i]) st.pop();
            if(st.size()>0) nge[i]=(int)st.peek();
            else nge[i]=-1;
            st.push(n2[i]);
        }
        HashMap h=new HashMap();
        for(int i=n2.length-1;i>=0;i--)
        {
            h.put(n2[i],nge[i]);
        }
        int ans[]=new int[n1.length];
        int i=0;
        for(int x:n1)
        {
            if(h.containsKey(x))
            {
                int help=(int)h.get(x);
                ans[i]=help;
                i++;
            }
        }

        return ans;
    }
}