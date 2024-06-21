class Solution {
    public int minimumPushes(String w) {
        int l=w.length();
        int p=0;
        for(int i=0;i<l;i++)
        {
            if((i/8)==0)
            p++;
            else if((i/8)==1)
            p+=2;
            else if((i/8)==2)
            p+=3;
            else 
            p+=4;
        }
        return p;
    }
}