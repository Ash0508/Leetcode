class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> r=new ArrayList<>();
        backtrack(s,0,new ArrayList<>(),r);
        return r;
    }

    private void backtrack(String s,int st,List<String>curr,List<List<String>> r)
    {
        if(st==s.length())
        {
            r.add(new ArrayList<>(curr));
            return;
        }
        for(int e=st;e<s.length();e++)
        {
            if(ispalindrome(s,st,e)){
                curr.add(s.substring(st,e+1));
                backtrack(s,e+1,curr,r);
                curr.remove(curr.size()-1);
            }
        }
    }
    private boolean ispalindrome(String s,int low,int high)
    {
        while(low<high)
        {
            if(s.charAt(low++) != s.charAt(high--)){
                return false;
            }
        }
        return true;
    }
}