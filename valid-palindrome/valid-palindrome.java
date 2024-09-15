public class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder filtered = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                filtered.append(Character.toLowerCase(c));
            }
        }
        
        String str = filtered.toString();
        return str.equals(filtered.reverse().toString());
    }
}
