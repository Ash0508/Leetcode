import java.util.*;
class Solution {
    public String addBinary(String a, String b) 
    {
    int carry=0;        
        StringBuilder r=new StringBuilder ();
        
        int max=Math.max(a.length(),b.length());;
        
        a=String.format("%"+max+"s",a).replace(' ','0');
        b=String.format("%"+max+"s",b).replace(' ','0');
        
        for(int i=max-1;i>=0;i--)
        {
        int s=carry+(a.charAt(i) - '0')+(b.charAt(i) - '0');
        r.insert(0,s%2);
        carry=s/2;
        }
        if(carry!=0)
        {
        r.insert(0,carry);
        }
        
        return r.toString();
        
    }
}