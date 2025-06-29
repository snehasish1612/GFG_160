class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        // code here
        int n = arr.length;
        int count0 = 0, count1 = 0, count2 = 0;
        
        for(int i = 0; i < n; i++){
            if(arr[i] == 0)
                count0++;
            if(arr[i] == 1)
                count1++;
            if(arr[i] == 2)
                count2++;
        }
        
        int index = 0;
        for(int i = 0; i < count0; i++){
            arr[index] = 0;
            index++;
        }
        for(int i = 0; i < count1; i++){
            arr[index] = 1;
            index++;
        }
        for(int i = 0; i < count2; i++){
            arr[index] = 2;
            index++;
        }
    }
}
