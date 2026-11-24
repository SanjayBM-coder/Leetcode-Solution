class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        
        // Start pointers at the rightmost characters (least significant bits)
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        
        // Loop while there are digits left in either string or a remaining carry
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            
            // Add bit from string 'a' if available
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }
            
            // Add bit from string 'b' if available
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }
            
            // Append the current binary digit (0 or 1)
            result.append(sum % 2);
            
            // Calculate carry for the next position (0 or 1)
            carry = sum / 2;
        }
        
        // Reverse the built string since digits were added from right to left
        return result.reverse().toString();
    }
}
