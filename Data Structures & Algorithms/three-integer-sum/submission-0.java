class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> solution = new ArrayList<>();
        
        // 1. Sort the array to easily handle duplicates and use two pointers
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate elements for the first position to avoid duplicate triplets
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            // If the current number is greater than 0, the sum cannot be 0 (since array is sorted)
            if (nums[i] > 0) {
                break;
            }
            
            int left = i + 1;
            int right = nums.length - 1;
            
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                
                if (sum == 0) {
                    solution.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // Skip duplicates for the second and third positions
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++; // Sum is too small, move left pointer to increase sum
                } else {
                    right--; // Sum is too large, move right pointer to decrease sum
                }
            }
        }
        
        return solution;
    }
}