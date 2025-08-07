// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        Map<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0, result = 0;
        
        for(int i = 0; i < arr.length; i++){
            prefixSum += arr[i];
            
            if(prefixSum == k)
                result = i + 1;
            else if(map.containsKey(prefixSum - k))
                result = Math.max(result, i - map.get(prefixSum - k));
                
            if(!map.containsKey(prefixSum))
                map.put(prefixSum, i);
        }
        
        return result;
    }
}
