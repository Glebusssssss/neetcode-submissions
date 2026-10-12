class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Set<Integer> ints = new HashSet<>();
        for (int n : nums) {
            ints.add(n);
        }

        int longestStreak = 0;

        // Loop through the set of unique numbers
        for (int n : ints) {
            // Check if 'n' is the START of a sequence (n - 1 does not exist)
            if (!ints.contains(n - 1)) {
                int currentNum = n;
                int currentStreak = 1;

                // Count consecutive numbers going forward
                while (ints.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                // Keep track of the maximum length found
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}