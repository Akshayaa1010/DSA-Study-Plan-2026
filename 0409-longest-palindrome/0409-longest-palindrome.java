class Solution {
    public int longestPalindrome(String s) {
        int[] charCounts = new int[128]; // Tracks frequencies for all ASCII characters
        
        for (char c : s.toCharArray()) {
            charCounts[c]++;
        }
        
        int length = 0;
        boolean hasOdd = false;
        
        for (int count : charCounts) {
            if (count % 2 == 0) {
                length += count;
            } else {
                length += count - 1; // Add the even part
                hasOdd = true;       // Track that we can place 1 odd character in the middle
            }
        }
        
        if (hasOdd) {
            length += 1;
        }
        
        return length;
    }
}