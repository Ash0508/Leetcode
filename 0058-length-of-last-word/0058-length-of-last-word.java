class Solution {
    public int lengthOfLastWord(String s)
    {
        int j=0;
        int l=s.length();
        int i=l-1;
       
        while(i>=0 && s.charAt(i)==' ')
        {
            i--;
        }
        while(i>=0 && s.charAt(i)!=' ')
        {
            j++;
            i--;
        }
       

        return j;
        
    }
}

