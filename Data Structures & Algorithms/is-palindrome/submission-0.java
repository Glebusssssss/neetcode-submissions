class Solution {
    public boolean isPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char cLeft = s.charAt(left);
            char cRight = s.charAt(right);

            // If the left character is not alphanumeric, move left pointer forward
            if (!Character.isLetterOrDigit(cLeft)) {
                left++;
            } 
            // If the right character is not alphanumeric, move right pointer backward
            else if (!Character.isLetterOrDigit(cRight)) {
                right--;
            } 
            // Both are alphanumeric, compare them case-insensitively
            else {
                if (Character.toLowerCase(cLeft) != Character.toLowerCase(cRight)) {
                    return false;
                }
                left++;
                right--;
            }
        }

        return true;
    }
}