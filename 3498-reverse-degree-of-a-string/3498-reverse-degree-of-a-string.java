class Solution {
    public int reverseDegree(String s) {
        int t=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            int rev=26-(s.charAt(i)-'a');
            int sp=i+1;
            t+=rev*sp;
        }
        return t;
        
    }
}