class Solution {
    int maxSubarraySum(int[] arr) {
        // Your code here
        int n = arr.length;
        
        int maxSoFar = arr[0];
        int maxEndHere = arr[0];
        
        for(int i = 1; i < n; i++){
            maxEndHere = Math.max(arr[i], maxEndHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndHere);
        }
        
        return maxSoFar;
    }
}
