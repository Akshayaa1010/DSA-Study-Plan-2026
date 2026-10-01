import java.util.*;

class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] cnt = new int[10];
        for (int d : digits) cnt[d]++;
        
        List<Integer> list = new ArrayList<>();
        
        for (int i = 100; i < 1000; i += 2) {
            int d1 = i / 100;
            int d2 = (i / 10) % 10;
            int d3 = i % 10;
            
            cnt[d1]--;
            cnt[d2]--;
            cnt[d3]--;
            
            if (cnt[d1] >= 0 && cnt[d2] >= 0 && cnt[d3] >= 0) {
                list.add(i);
            }
            
            cnt[d1]++;
            cnt[d2]++;
            cnt[d3]++;
        }
        
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}