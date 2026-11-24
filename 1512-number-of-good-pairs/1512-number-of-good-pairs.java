import java.util.HashMap;
import java.util.Map;

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int goodPairs = 0;
        Map<Integer, Integer> countMap = new HashMap<>();
        
        for (int num : nums) {
            // Get how many times 'num' has appeared before the current index
            int currentCount = countMap.getOrDefault(num, 0);
            
            // Add that count to the total good pairs
            goodPairs += currentCount;
            
            // Increment the frequency of 'num'
            countMap.put(num, currentCount + 1);
        }
        
        return goodPairs;
    }
}
