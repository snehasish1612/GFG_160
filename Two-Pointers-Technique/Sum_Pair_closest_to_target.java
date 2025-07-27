// User function Template for Java

class Solution {
    public List<Integer> sumClosest(int[] arr, int target) {
        // code here
        int n = arr.length;
        Arrays.sort(arr);
        List<Integer> result = new ArrayList<>();
        int left = 0, right = n - 1;
        int minDiff = Integer.MAX_VALUE;
        
        while(left < right){
            int currSum = arr[left] + arr[right];
            
            if(Math.abs(target - currSum) < minDiff){
                minDiff = Math.abs(target - currSum);
                result = Arrays.asList(arr[left], arr[right]);
            }
            
            if(currSum < target)    
                left++;
            else if(currSum > target)
                right--;
            else
                return result;
        }
        return result;
    }
}
