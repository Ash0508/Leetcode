class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        else{
            HashMap<Character, Integer> mp1=makefreqMap(s);
            HashMap<Character, Integer> mp2=makefreqMap(t);
            return mp1.equals(mp2);
        }
        
    }
    static HashMap<Character, Integer> makefreqMap(String s)
    {
        HashMap<Character, Integer> mp=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            Character ch= s.charAt(i);
            if(!mp.containsKey(ch)){
                mp.put(ch,1);
            }
            else{
                int curr=mp.get(ch);
                mp.put(ch,curr+1);
            }
        }
        return mp;
    }
    
}