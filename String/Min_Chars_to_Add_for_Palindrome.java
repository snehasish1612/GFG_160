// User function Template for Java

class Solution {
    public static int minChar(String s) {
        // Write your code here
        String reverse = new StringBuilder(s).reverse().toString();
        
        String temp = s + "#" + reverse;
        int[] lps = computeLPS(temp);
        
        return s.length() - lps[temp.length() - 1];
    }
    
    static int[] computeLPS(String temp){
        int m = temp.length();
        int[] lps = new int[m];
        int len = 0;
        int i = 1;
        
        while(i < m){
            if(temp.charAt(i) == temp.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }
            else{
                if(len != 0){
                    len = lps[len - 1];
                }
                else{
                    lps[i] = 0;
                    i++;
                }
            }
        }
        
        return lps;
    }
}
