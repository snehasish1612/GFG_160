class Solution {
    static char nonRepeatingChar(String s) {
        // code here
        int[] freq = new int[256];
        
        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i)]++;
        }
        
        for(int i = 0; i < s.length(); i++){
            if(freq[s.charAt(i)] == 1)
                return s.charAt(i);
        }
        
        return '$';
    }
}
