
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        ArrayList<Integer> result;
        int start = 0, end = 0, currSum = 0;
        
        while(end < arr.length){
            currSum += arr[end];
            
            while(currSum > target && start < end){
                currSum -= arr[start];
                start++;
            }
            
            if(currSum == target){
                result = new ArrayList<>(Arrays.asList(start+1, end+1));
                return result;
            }
            
            end++;
        }
        
        result = new ArrayList<>(Arrays.asList(-1));
        return result;
    }
}
