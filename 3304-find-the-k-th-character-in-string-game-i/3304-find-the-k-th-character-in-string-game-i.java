class Solution {
    public char kthCharacter(int k) {
        StringBuilder word = new StringBuilder("a");
        
        while (word.length() < k) {
            int currentLength = word.length();
            for (int i = 0; i < currentLength; i++) {
                char nextChar = (char) (word.charAt(i) + 1);
                if (nextChar > 'z') {
                    nextChar = 'a'; // Wrap around if it exceeds 'z'
                }
                word.append(nextChar);
            }
        }
        
        return word.charAt(k - 1);
    }
}