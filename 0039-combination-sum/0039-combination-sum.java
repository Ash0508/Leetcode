class Solution {
    public List<List<Integer>> combinationSum(int[] c, int t) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        List<Integer> ds=new ArrayList<>();
        int n=c.length;
        recur(0,c,t,ds,res);
        return res;
    }
    private void recur(int s,int c[], int t,List<Integer>ds,List<List<Integer>> res)
    {
        if(s==c.length){
            if(t==0) res.add(new ArrayList<>(ds));
                  return ;
        }
        if(c[s]<=t){
            ds.add(c[s]);
            recur(s,c,t-c[s],ds,res);
            ds.remove(ds.size()-1);
        }
        recur(s+1,c,t,ds,res);
    }
}