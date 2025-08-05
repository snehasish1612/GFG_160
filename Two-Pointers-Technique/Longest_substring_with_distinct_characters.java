class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        int n = s.length();
        int[] dict = new int[256];
        
        Arrays.fill(dict, -1);
        int maxLen = -1, start = -1;
        
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            
            if(dict[ch] > start)
                start = dict[ch];
                
            dict[ch] = i;
            
            maxLen = Math.max(maxLen, i - start);
        }
        
        return maxLen;
    }
}
