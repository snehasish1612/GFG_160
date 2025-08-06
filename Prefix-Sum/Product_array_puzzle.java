// User function Template for Java
class Solution {
    public static int[] productExceptSelf(int arr[]) {
        // code here
        int n = arr.length;
        int[] result = new int[n];
        
        result[0] = 1;
        for(int i = 1; i < n; i++){
            result[i] = result[i - 1] * arr[i - 1];
        }
        
        int suffix = 1;
        for(int i = n - 2; i >= 0; i--){
            suffix *= arr[i + 1];
            result[i] *= suffix;
        }
        
        return result;
    }
}
