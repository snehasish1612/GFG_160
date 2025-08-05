class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        
        for(int i = 0; i <= n - k; i++){
            Set<Integer> set = new HashSet<>();
            
            for(int j = i; j < i + k; j++)
                set.add(arr[j]);
                
            result.add(set.size());
        }
        
        return result;
    }
}
