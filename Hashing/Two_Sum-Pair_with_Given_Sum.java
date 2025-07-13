class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        int n = arr.length;
        Set<Integer> set = new HashSet<>();
        
        for(int i = 0; i < n; i++){
            int secNum = target - arr[i];
            
            if(set.contains(secNum))
                return true;
            
            set.add(arr[i]);
        }
        
        return false;
    }
}
