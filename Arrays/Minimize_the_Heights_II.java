// User function Template for Java

class Solution {
    int getMinDiff(int[] arr, int k) {
        // code here
        int n = arr.length;
        Arrays.sort(arr);
        int result = arr[n - 1] - arr[0];
        
        
        int arrMin = arr[0] + k;
        int arrMax = arr[n - 1] - k;
        
        for(int i = 0; i < n - 1; i++){
            int min = Math.min(arrMin, arr[i + 1] - k);
            int max = Math.max(arrMax, arr[i] + k);
            
            if(min < 0)
                continue;
            
            result = Math.min(result, max - min);
        }
        
        return result;
    }
}
