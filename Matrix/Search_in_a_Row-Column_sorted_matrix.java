class Solution {
    public static boolean matSearch(int mat[][], int x) {
        // your code here
        for(int i = 0; i < mat.length; i++){
            if( binarySearch(mat[i], x))
                return true;
        }
        
        return false;
    }
    
    public static boolean binarySearch(int mat[], int x){
        int left = 0, right = mat.length - 1;
        
        while(left <= right){
            int mid = left + (right - left) / 2;
            
            if(mat[mid] == x)
                return true;
            else if(mat[mid] < x)
                left = mid + 1;
            else
                right = mid - 1;
        }
        
        return false;
    } 
}
