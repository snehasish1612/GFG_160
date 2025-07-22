class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        int count = 0, n = arr.length, pXOR = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            pXOR ^= num;
            if(pXOR == k)
                count++;
            
            int val = pXOR ^ k;
            if(map.containsKey(val))
                count += map.get(val);
            
            map.put(pXOR, map.getOrDefault(pXOR, 0) + 1);
        }
        
        return count;
    }
}
