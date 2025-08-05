class Solution {
    public int maxWater(int arr[]) {
        // Code Here
        int lp = 0, rp = arr.length - 1;
        int maxArea = 0;
        
        while(lp < rp){
            int width = rp - lp;
            int height = Math.min(arr[lp], arr[rp]);
            int currArea = height * width;
            maxArea = Math.max(maxArea, currArea);
            
            if(arr[lp] < arr[rp]) 
                lp++;
            else
                rp--;
        }
        
        return maxArea;
    }
}
