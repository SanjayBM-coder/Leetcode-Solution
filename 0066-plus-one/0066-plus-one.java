class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Traverse the array from the end to the beginning
        for (int i = n - 1; i >= 0; i--) {
            // If the current digit is less than 9, increment and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            
            // Otherwise, set current digit to 0 and carry over 1
            digits[i] = 0;
        }
        
        // If all digits were 9, we need an extra leading 1
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}
