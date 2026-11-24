class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        
        // Iterate through each customer
        for (int[] customer : accounts) {
            int currentWealth = 0;
            
            // Sum all accounts for the current customer
            for (int bank : customer) {
                currentWealth += bank;
            }
            
            // Update maxWealth if the current customer is richer
            maxWealth = Math.max(maxWealth, currentWealth);
        }
        
        return maxWealth;
    }
}
