class Solution {
    public String minRemoveToMakeValid(String s) {
        char ch[]=s.toCharArray();
        int count=0;
        for(int i=0;i<ch.length;i++)
        {
            char c=ch[i];
            if(c=='(') count++;
            else if(c==')')
            {
                if(count==0) ch[i]='*';
                else count--;
            }
        }

        for(int i=ch.length-1;i>=0 && count>0;i--)
        {
        if(ch[i]=='(')
        {
            ch[i]='*';
            count--;
        }
        }

        StringBuilder r=new StringBuilder();
        for(char car:ch)
        {
            if(car!='*') r.append(car);
        }

        return r.toString();
    }
}