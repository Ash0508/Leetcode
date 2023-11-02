class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int carry = 1; // Initialize the carry to 1 (for adding 1)

        for (int i = n - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            digits[i] = sum % 10; // Update the current digit
            carry = sum / 10; // Calculate the carry for the next iteration
        }

        if (carry == 0) {
            return digits; // No carry, return the updated array
        } else {
            int[] result = new int[n + 1];
            result[0] = carry;
            System.arraycopy(digits, 0, result, 1, n);
            return result;
        }
    }
}
