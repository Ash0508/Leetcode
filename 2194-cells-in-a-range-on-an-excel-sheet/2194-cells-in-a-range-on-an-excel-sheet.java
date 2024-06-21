class Solution {
    public List<String> cellsInRange(String s) {
        char sc=s.charAt(0);
        int sint=s.charAt(1)-'0';
        char midc=s.charAt(3);
        int mint=s.charAt(4)-'0';

        ArrayList<String> ans=new ArrayList<>();

        for(char c=sc;c<=midc;)
        {
            for(int i=sint;i<=mint;i++)
            {
                ans.add(c+""+i);
            }
            c=(char)(c+1);
        }
        return ans;
    }
}