class Solution {
    public int cntSubarrays(int[] arr, int k) {
        // code here
        int count = 0, n = arr.length;
        int[] PS = new int[n];
        
        PS[0] = arr[0];
        for(int i = 1; i < n; i++)
            PS[i] = PS[i - 1] + arr[i];
            
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(PS[i] == k) count++;
            
            int val = PS[i] - k;
            if(map.containsKey(val))
                count += map.get(val);
            
            map.put(PS[i], map.getOrDefault(PS[i], 0) + 1);
        }
        
        return count;
    }
}
