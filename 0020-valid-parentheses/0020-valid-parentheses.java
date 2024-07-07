import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            
            // If the character is an opening bracket, push it onto the stack
            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } else {
                // If the stack is empty, there is no matching opening bracket
                if (st.isEmpty()) return false;
                
                char top = st.pop();
                
                // Check if the current closing bracket matches the top of the stack
                if ((ch == ')' && top != '(') ||
                    (ch == ']' && top != '[') ||
                    (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }
        
        // If the stack is empty, all opening brackets have been matched
        return st.isEmpty();
    }
}
