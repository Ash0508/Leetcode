class Solution {
    public int longestConsecutive(int[] a) {
      HashSet<Integer> hs = new HashSet<>();

        for (int i: a){
            hs.add(i);
        }
        int c =0;

        for (int x:hs){
            if(!hs.contains(x-1)){
                int y = x+1;
                while(hs.contains(y)){
                    y++;
                }
                c= Math.max(c,y-x);
            }
        }
        return c;
    }
}