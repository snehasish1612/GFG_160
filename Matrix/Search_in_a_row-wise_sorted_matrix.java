class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchRowMatrix(int[][] mat, int x) {
        // code here
        for(int i = 0; i < mat.length; i++){
            if(binarySearch(mat[i], x))
                return true;
        }
        
        return false;
    }
    
    public boolean binarySearch(int[] mat, int x){
        int low = 0, high = mat.length - 1;
        
        while(low <= high){
            int mid = low + (high - low) / 2;
            
            if(mat[mid] == x)
                return true;
            else if(mat[mid] < x)
                low = mid + 1;
            else
                high = mid - 1;
        }
        
        return false;
    }
}
