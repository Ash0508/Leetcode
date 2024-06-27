class Solution {
    public String getPermutation(int n, int k) {
        int fact=1;
        List<Integer> no=new ArrayList<>();
        for(int i=1;i<n;i++)
        {
            fact*=i;
            no.add(i);
        }
        no.add(n);
        String ans="";
        k--;

        while(true)
        {
            ans+=no.get(k/fact);
            no.remove(k/fact);
            if(no.size()==0){
                break;
            }
            k=k%fact;
            fact/=no.size();
        }

        return ans;
        
    }
}