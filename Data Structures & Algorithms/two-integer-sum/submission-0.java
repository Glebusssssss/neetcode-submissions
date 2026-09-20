class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    { 
        Map<Integer, Integer> map = new HashMap<>();

        for (int j = 0; j < nums.length; j++) {
            int complement = target - nums[j];

           
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), j };
            }

            
            map.put(nums[j], j);
        }

        return new int[0];
    }
}
