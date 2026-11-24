class Solution {
    public double average(int[] salary) {
        int minSalary = Integer.MAX_VALUE;
        int maxSalary = Integer.MIN_VALUE;
        double totalSum = 0;

        for (int s : salary) {
            totalSum += s;
            if (s < minSalary) {
                minSalary = s;
            }
            if (s > maxSalary) {
                maxSalary = s;
            }
        }

        // Subtract min and max, then divide by (n - 2)
        return (totalSum - minSalary - maxSalary) / (salary.length - 2);
    }
}
