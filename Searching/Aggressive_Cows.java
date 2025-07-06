// User function Template for Java
class Solution {
    public static int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        int start = 1, end = stalls[stalls.length - 1] - stalls[0], ans = 0;
        
        while(start <= end){
            int mid = start + (end - start) / 2;
            
            if(isPossible(mid, stalls, k)){
                ans = mid;
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        
        return ans;
    }
    
    public static boolean isPossible(int mid, int[] stalls, int k){
        int cows = 1, lastPos = stalls[0];
        
        for(int i = 1; i < stalls.length; i++){
            if(stalls[i] - lastPos >= mid){
                cows++;
                lastPos = stalls[i];
            }
            
            if(cows == k)
                return true;
        }
        
        return false;
    }
}
