
class Solution {
    // Function to find the smallest positive number missing from the array.
    public int missingNumber(int[] arr) {
        // Your code here
        int n = arr.length;
        
        for(int i = 0; i < n; i++){
            if(arr[i] <= 0 || arr[i] > n){
                arr[i] = n + 1;
            }
        }
        
        for(int i = 0; i < n; i++){
            int val = Math.abs(arr[i]);
            if(val >= 1 && val <= n){
                arr[val - 1] = -Math.abs(arr[val - 1]);
            }
        }
        
        for(int i = 0; i < n; i++){
            if(arr[i] > 0){
                return i + 1;
            }
        }
        
        return n + 1;
    }
}
