class Solution(object):
    def longestValidParentheses(self, s):
        """
        :type s: str
        :rtype: int
        """
        stack = [-1]  # Initialize a stack with a dummy value -1 to handle edge cases
        max_length = 0  # Initialize the maximum length of valid parentheses substring

        for i, char in enumerate(s):  # Iterate through each character and its index in the string
            if char == '(':  # If the character is an opening parenthesis
                stack.append(i)  # Push the index of the opening parenthesis onto the stack
            else:  # If the character is a closing parenthesis
                if stack:  # If the stack is not empty (i.e., there is a matching opening parenthesis for this closing parenthesis)
                    stack.pop()  # Pop the index of the matching opening parenthesis from the stack
                    if stack:  # If the stack is still not empty (i.e., there are more opening parentheses without matches)
                        # Calculate the length of the current valid substring and update max_length if necessary
                        max_length = max(max_length, i - stack[-1])
                    else:
                        # If the stack is empty, push the current index onto the stack as a starting point for the next valid substring
                        stack.append(i)

        return max_length
        