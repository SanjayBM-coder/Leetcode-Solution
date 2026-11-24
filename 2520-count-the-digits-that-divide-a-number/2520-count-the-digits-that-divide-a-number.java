class Solution {
    public int countDigits(int num) {
        int count = 0;
        int temp = num; // Store original value to extract digits safely
        
        while (temp > 0) {
            int digit = temp % 10; // Get the last digit
            
            // Check if the digit is not zero and divides num evenly
            if (digit != 0 && num % digit == 0) {
                count++;
            }
            
            temp = temp / 10; // Remove the last digit
        }
        
        return count;
    }
}
