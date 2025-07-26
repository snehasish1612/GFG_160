class Solution {
    public int countTriplets(int[] arr, int target) {
        // Code Here
        int n = arr.length,  count = 0;
        Arrays.sort(arr);
        
        for(int i = 0; i < n - 2; i++){
            int j = i + 1, k = n - 1;
            while(j < k){
                int sum = arr[i] + arr[j] + arr[k];
                if(sum < target)
                    j++;
                else if(sum > target)
                    k--;
                else{
                    if(arr[j] == arr[k]){
                        int len = k - j + 1;
                        count += len * (len - 1) / 2;
                        break;
                    }
                    
                    int left = 1;
                    while(j + 1 < k && arr[j] == arr[j + 1]){
                        j++;
                        left++;
                    }
                    
                    int right = 1;
                    while(k - 1 > j && arr[k] == arr[k - 1]){
                        right++;
                        k--;
                    }
                    
                    count += left * right;
                    j++;
                    k--;
                }
            }
        }
        
        return count;
    }
}
