// User function Template for Java
class Solution {
    public int findDuplicate(int[] arr) {
        // code here
        int ans = 0;
        int n = arr.length;
        
        for(int i = 1; i < n; i++)
            ans ^= i;
            
        for(int i = 0; i < n; i++)
            ans ^= arr[i];
            
        return ans;
    }
}
