// User function Template for Java
class Solution {
    int countPairs(int arr[], int target) {
        // Your code here
        int n = arr.length;
        Arrays.sort(arr);
        int count = 0;
        int left = 0, right = n - 1;
        
        while(left < right){
            if(arr[left] + arr[right] < target){
                count += (right - left);
                left++;
            }else{
                right--;
            }
        }
        
        return count;
    }
}
