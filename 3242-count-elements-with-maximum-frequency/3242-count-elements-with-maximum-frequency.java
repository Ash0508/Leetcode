class Solution {
    public int maxFrequencyElements(int[] a) {
        int l=a.length;
        int freq[]=new int [101];
          for (int num : a) {
            freq[num]++;
        }
        int maxfreq=0;

        for(int f:freq)
        {
            maxfreq=Math.max(maxfreq,f);
        }

        int total=0;
        for(int f:freq)
        {
            if(maxfreq==f) {total+=f;}
        }

        return total;
    }
}