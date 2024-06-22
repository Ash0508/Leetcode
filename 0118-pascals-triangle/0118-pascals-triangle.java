class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans=new ArrayList<>();

        for(int r=1;r<=n;r++)
        {
            List<Integer> temp=new ArrayList<>();

            for(int c=1;c<=r;c++)
            {
                temp.add(nCr(r-1,c-1));
            }
            ans.add(temp);
        }
        return ans;
    }
    public int nCr(int n,int r)
    {
        long res=1;
        for(int i=0;i<r;i++)
        {
            res*=(n-i);
            res/=(i+1);
        }
        return (int)res;
    }
    }