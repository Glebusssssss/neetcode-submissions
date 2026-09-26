class Solution 
{
    public boolean hasDuplicate(int[] nums) 
    {
        if (nums == null)
        {
            return false;
        }
        Set<Integer> set = new  HashSet<>();

        for(int n : nums)
        {
            if(!set.add(n))
            {
                return true;
            }
            
        }

    return false;
    }
    
}