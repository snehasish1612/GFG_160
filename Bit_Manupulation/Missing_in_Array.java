class Solution {
    int missingNum(int arr[]) {
        // code here
        int n = arr.length + 1;
        int ans = 0;
        
        for(int i = 1; i <= n; i++)
            ans ^= i;
        
        for(int num : arr)
            ans ^= num;
            
        return ans;
    }
}
