class StockSpanner {

    Stack<int []>st;
    public StockSpanner() {
        st=new Stack<>();
    }
    
    public int next(int p) {
        int ans=1;
        while(st.size()>0 && st.peek()[0]<=p) ans+=st.pop()[1];
        st.push(new int[]{p,ans});
        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */