// User function Template for Java

class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int n = arr.length;
        
        int j = 0;
        
        for(int i = 0; i < n; i++){
            if(arr[i] != 0){
                arr[j++] = arr[i];
            }
        }
        
        while(j < n){
            arr[j++] = 0;
        }
        
    }
}
