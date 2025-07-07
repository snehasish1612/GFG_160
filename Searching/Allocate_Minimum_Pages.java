
//Back-end complete function Template for Java

class Solution {
    public static int findPages(int[] arr, int k) {
        // code here
        int start = 0, end = 0, ans = -1;
        
        if(arr.length < k)
            return ans;
        
        for(int i = 0; i < arr.length; i++){
            end += arr[i];
        }
        
        while(start <= end){
            int mid = start + (end - start) / 2;
            
            if(isValid(mid, arr, k)){
                ans = mid;
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        
        return ans;
    }
    
    public static boolean isValid(int mid, int[] arr, int k){
        int studentCount = 1, pages = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > mid)
                return false;
                
            if(pages + arr[i] <= mid){
                pages += arr[i];
            }else{
                pages = arr[i];
                studentCount++;
            }
        }
        
        return studentCount <= k;
    }
}
