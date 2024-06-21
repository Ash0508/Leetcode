class Solution {
    public int minimumPushes(String w) {
        int a[]=new int[26];
        for(char ch:w.toCharArray())
        {
            a[ch-'a']--;
        }

        Arrays.sort(a);
        int c=0;
        for(int i=0;i<26;i++)
        {
            c-=a[i]*(i/8+1);
        }
        return c;
    }
}