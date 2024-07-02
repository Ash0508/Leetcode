class Solution {
    public List<List<Integer>> combinationSum2(int[] c, int t) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(c);
        List<Integer> al=new ArrayList<>();
        findAns(0,c,t,ans,al);
        return ans;
    }
    public void findAns(int index,int []c,int t,List<List<Integer>> ans,List<Integer> al)
    {
        if(t==0){
            ans.add(new ArrayList<>(al));
            return;
        }
        for(int i=index;i<c.length;i++)
        {
            if(i>index && c[i]==c[i-1]) continue;
            if(c[i]>t){ break;}
        
        al.add(c[i]);
        findAns(i+1,c,t-c[i],ans,al);
        al.remove(al.size()-1);
        }
    }
}