class Solution {
    public int maxLen(int[] arr) {
        // Your code here
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0, prefixSum = 0;
        
        for(int i = 0; i < arr.length; i++){
            prefixSum += (arr[i] == 0) ? -1 : 1;
            
            if(prefixSum == 0)
                result = i + 1;
            else if(map.containsKey(prefixSum))
                result = Math.max(result, i - map.get(prefixSum));
            else
                map.put(prefixSum, i);
        }
        
        return result;
    }
}
