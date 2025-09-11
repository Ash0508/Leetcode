class Solution {
    public String sortVowels(String s) {
        int l=s.length();
        Set<Character> vowels=new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));

        ArrayList<Character> vs=new ArrayList<>();
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(vowels.contains(ch)) vs.add(ch);
        }
         char[] arr=s.toCharArray();

        Collections.sort(vs);

        int idx=0;
        for(int i=0;i<l;i++)
        {
            if(vowels.contains(arr[i]))
            {
                arr[i]=vs.get(idx++);
            }
        }
        return new String(arr);
        
    }
}