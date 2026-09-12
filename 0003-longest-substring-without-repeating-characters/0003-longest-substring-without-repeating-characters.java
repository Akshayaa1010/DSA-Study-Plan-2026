class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Array to store the last seen position + 1 of ASCII characters
        int[] charIndex = new int[128]; 
        int maxLength = 0;
        int left = 0; // Left boundary of the sliding window

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // If the character was seen inside the current window, move the left pointer
            left = Math.max(left, charIndex[currentChar]);

            // Calculate the current window size and update the maximum length
            maxLength = Math.max(maxLength, right - left + 1);

            // Store the next index (1-based index) to easily shift the left pointer
            charIndex[currentChar] = right + 1;
        }

        return maxLength;
    }
}
