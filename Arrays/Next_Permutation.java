class Solution {
    void nextPermutation(int[] arr) {
        // code here
        int n = arr.length;
        
        int piv = -1;
        
        for(int i = n - 2; i >= 0; i--){
            if(arr[i] < arr[i + 1]){
                piv = i;
                break;
            }
        }
        
        if(piv == -1){
            reverse(arr, 0, n - 1);
            return;
        }
        
        for(int i = n - 1; i > piv; i--){
            if(arr[i] > arr[piv]){
                swap(arr, i, piv);
                break;
            }
        }
        
        reverse(arr, piv + 1, n - 1);
    }
    
    void reverse(int arr[], int start, int end){
        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    
    void swap(int arr[], int i, int j){
        int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
    }
}
