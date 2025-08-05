class Solution {
    public int maxWater(int arr[]) {
        // code here
        int n = arr.length;
        int ans = 0, l = 0, r = n - 1, lmax = 0, rmax = 0;
        
        while(l < r){
            lmax = Math.max(lmax, arr[l]);
            rmax = Math.max(rmax, arr[r]);
            
            if(lmax < rmax){
                ans += lmax - arr[l];
                l++;
            }else{
                ans += rmax - arr[r];
                r--;
            }
        }
        
        return ans;
    }
}
