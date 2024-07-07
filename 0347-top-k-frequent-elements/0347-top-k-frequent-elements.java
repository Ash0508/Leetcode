class Solution {
    public int[] topKFrequent(int[] n, int k) {
        List<Integer>[] bucket=new List[n.length+1]; 
        HashMap<Integer,Integer> frequencyMap=new HashMap<>(); 
        for (int num : n) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        for(int key:frequencyMap.keySet())
        {
            int freq=frequencyMap.get(key);
            if(bucket[freq]==null) bucket[freq]=new ArrayList<>();
        bucket[freq].add(key);
        }
        int []ans=new int[k];
        int pos=0;
        for(int i=bucket.length-1;i>=0;i--)
        {
            if(bucket[i]!=null){
                for(int j=0;j<bucket[i].size() && pos<k;j++)
                {
                    ans[pos]=bucket[i].get(j);
                    pos++;
                }
            }
        }
        return ans;
    }
}