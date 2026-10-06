class Solution {
    public String removeDuplicateLetters(String s) {
        int[] count = new int[26];
        boolean[] vis = new boolean[26];
        
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            int idx = c - 'a';
            count[idx]--;
            
            if (vis[idx]) continue;
            
            while (sb.length() > 0 && c < sb.charAt(sb.length() - 1) && count[sb.charAt(sb.length() - 1) - 'a'] > 0) {
                vis[sb.charAt(sb.length() - 1) - 'a'] = false;
                sb.deleteCharAt(sb.length() - 1);
            }
            
            sb.append(c);
            vis[idx] = true;
        }
        
        return sb.toString();
    }
}