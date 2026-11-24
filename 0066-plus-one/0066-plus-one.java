class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Traverse from the rightmost digit to the leftmost
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // No further carry needed
            }
            // If the digit is 9, it becomes 0 and we carry 1 to the next iteration
            digits[i] = 0;
        }

        // If all digits were 9 (e.g., [9, 9] ->)
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}
