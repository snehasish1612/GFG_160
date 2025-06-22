class Solution {
    int maxProduct(int[] arr) {
        // code here
        int n = arr.length;
        int max = arr[0];
        int min = arr[0];
        int maxResult = arr[0];
        
        for(int i = 1; i < n; i++){
            int temp = max;
            
            max = Math.max(arr[i], Math.max(arr[i] * max, arr[i] * min));
            min = Math.min(arr[i], Math.min(arr[i] * temp, arr[i] * min));
            
            maxResult = Math.max(maxResult, max);
        }
        
        return maxResult;
    }
}
