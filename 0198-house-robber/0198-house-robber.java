class Solution {
    public int rob(int[] a) {
        int l=a.length;
        int s1=0,s2=0;
        for(int i=0;i<l;i++)
        {
        int ne=s2+a[i];
        int nr=Math.max(s1,s2);
        s1=ne;
        s2=nr;
        }
        return Math.max(s1,s2);
    }
}