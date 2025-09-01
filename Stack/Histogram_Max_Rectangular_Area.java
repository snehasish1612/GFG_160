class Solution {
    public static int getMaxArea(int arr[]) {
        // your code here
        int ans = 0;
        
        int[] right = nextRightMin(arr);
        int[] left = nextLeftMin(arr);
        
        for(int i = 0; i < arr.length; i++){
            int width = right[i] - left[i] - 1;
            int currArea = arr[i] * width;
            ans = Math.max(ans, currArea);
        }
        
        return ans;
    }
    
    public static int[] nextRightMin(int arr[]){
        int[] result = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        
        for(int i = arr.length - 1; i >= 0; i--){
            while(!st.isEmpty() && arr[i] <= arr[st.peek()])
                st.pop();
            
            result[i] = (st.isEmpty()) ? arr.length : st.peek();    
            
            st.push(i);
        }
        
        return result;
    }
    
    public static int[] nextLeftMin(int arr[]){
        int[] result = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0; i < arr.length; i++){
            while(!st.isEmpty() && arr[i] <= arr[st.peek()])
                st.pop();
               
            result[i] = (st.isEmpty()) ? -1 : st.peek();    
                
            st.push(i);
        }
        
        return result;
    }
}
