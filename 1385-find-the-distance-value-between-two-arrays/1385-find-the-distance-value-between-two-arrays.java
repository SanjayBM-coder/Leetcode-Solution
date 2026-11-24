import java.util.Arrays;

class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        // Sort arr2 to enable binary search
        Arrays.sort(arr2);
        int farCount = 0;

        for (int num : arr1) {
            if (isFar(arr2, num - d, num + d)) {
                farCount++;
            }
        }

        return farCount;
    }

    // Returns true if no element in arr2 lies within [low, high]
    private boolean isFar(int[] arr2, int low, int high) {
        int left = 0;
        int right = arr2.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr2[mid] >= low && arr2[mid] <= high) {
                return false; // Found an element within distance d
            } else if (arr2[mid] < low) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return true; // No elements found in the range
    }
}
