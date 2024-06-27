import java.util.*;
class Solution {
    public int[][] merge(int[][] arr) {
        int n=arr.length;

        Arrays.sort(arr,(a,b) -> a[0]-b[0]);
        List<Integer> a=new ArrayList<>();
        a.add(arr[0][0]);
        a.add(arr[0][1]);

        for(int i=1;i<n;i++)
        {
            if(a.get(a.size()-1)<arr[i][0])
            {
                a.add(arr[i][0]);
                a.add(arr[i][1]);
            }
            else if(a.get(a.size()-1)<arr[i][1])
            {
                a.set(a.size()-1,arr[i][1]);
            }
        }    
        

        int ans[][]=new int[a.size()/2][2];
        int k=0;
        for(int i=0;i<ans.length;i++)
        {
            ans[i][0]=a.get(k++);
            ans[i][1]=a.get(k++);
        }
            return ans;
    }
}