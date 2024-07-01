class Solution {
    public boolean canFinish(int v, int[][] p) {

        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<v;i++)
        {
            adj.add(new ArrayList<>());
        }
        int m=p.length;
        for(int i=0;i<m;i++)
        {
            adj.get(p[i][0]).add(p[i][1]);
        }
        int ind[]=new int[v];
        for(int i=0;i<v;i++){
            for(int it: adj.get(i)) ind[it]++;
        }

        Queue<Integer> q=new LinkedList<Integer>();
        for(int i=0;i<v;i++)
        {
            if(ind[i]==0) q.add(i);
        }

        List<Integer> topo=new ArrayList<Integer>();
        while(!q.isEmpty())
        {
            int node=q.peek();
            q.remove();
            topo.add(node);

            for(int it: adj.get(node))
            {
                ind[it]--;
                if(ind[it]==0) q.add(it);
            }
        }
        if(topo.size()==v) return true;
        return false;
        
    }
}