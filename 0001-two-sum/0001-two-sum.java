class Solution {
    public int[] twoSum(int[] a, int x) {
         int n=a.length;
        int ans[]={-1};
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int p=x - a[i];
            if(mp.containsKey(p))
            {
                ans=new int[]{i,mp.get(p)};
                return ans;
            }
            mp.put(a[i],i);
        }
        return ans; //O(N)
        
    }
}

//  int n=a.length;
    
//         int ans[]={-1,-1};
//         // int [] ans={-1};
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++)
//             {
//                 if((a[i]+a[j])==x)
//                 {
//                     ans[0]=i;// ans=new int[]{i,j};
//                     ans[1]=j;
//                     break;
//                 }
//             }
//         }
//         return ans;
        