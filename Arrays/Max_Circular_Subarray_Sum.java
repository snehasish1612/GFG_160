class Solution {
    public int circularSubarraySum(int arr[]) {
        // code here
        int n = arr.length;
        
        int MAX_KEDANE = kedane(arr);
        
        int total = 0;
        for(int i = 0; i < n; i++){
            total += arr[i];
            arr[i] = -arr[i];
        }
        
        int MAX_REV_KEDANE = kedane(arr);
        int maxWrap = total + MAX_REV_KEDANE;
        
        if(maxWrap == 0)
            return MAX_KEDANE;
        
        return Math.max(MAX_KEDANE, maxWrap);
    }
    
    public int kedane(int arr[]){
        int n = arr.length;
        int maxSoFar = arr[0], maxEndHere = arr[0];
        for(int i = 1; i < n; i++){
            maxEndHere = Math.max(arr[i], arr[i] + maxEndHere);
            maxSoFar = Math.max(maxSoFar, maxEndHere);
        }
        return maxSoFar;
    }
}

