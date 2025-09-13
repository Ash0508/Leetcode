class Solution {
    public int maxFreqSum(String s) {
        int freq[]=new int[26];

        for(char c:s.toCharArray())
        {
            freq[c-'a']+=1;
        }

        int vmax=0,cmax=0;
        String vowels="aeiou";

        for(int i=0;i<26;i++)
        {
            char c=(char) (i+'a');
            int f=freq[i];

            if(vowels.indexOf(c)!=-1)
            {
                vmax=Math.max(vmax,f);
            }
            else{
                cmax=Math.max(cmax,f);
            }
        }
        return vmax+cmax;
    }
}