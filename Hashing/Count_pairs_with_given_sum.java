class Solution {

    int countPairs(int arr[], int target) {
        // Your code here
        int n = arr.length, count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < n; i++){
            int secNum = target - arr[i];
            
            if(map.containsKey(secNum))
                count += map.get(secNum);
            
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        
        return count;
    }
}
