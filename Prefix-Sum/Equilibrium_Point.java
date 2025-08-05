class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        // code here
        int prefixSum = 0, total = 0;
        
        for(int num : arr){
            total += num;
        }
        
        for(int i = 1; i < arr.length; i++){
            prefixSum += arr[i - 1];
            
            if(prefixSum == total - prefixSum - arr[i])
                return i;
        }
        
        return -1;
    }
}
