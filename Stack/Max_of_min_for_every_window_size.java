
class Solution {
    public ArrayList<Integer> maxOfMins(int[] arr) {
        // Your code here
        int n = arr.length;
        int[] ans = new int[n + 1];
        
        int[] right = nextRightMin(arr, n);
        int[] left = nextLeftMin(arr, n);
        
        for(int i = 0; i < n; i++){
            int length = right[i] - left[i] - 1;
            ans[length] = Math.max(ans[length], arr[i]);
        }
        
        for(int i = n - 1; i >= 1; i--){
            ans[i] = Math.max(ans[i], ans[i + 1]);
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 1; i <= n; i++)
            result.add(ans[i]);
            
        return result;
    }
    
    public int[] nextLeftMin(int[] arr, int n){
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && arr[i] <= arr[st.peek()])
                st.pop();
            
            res[i] = (st.isEmpty()) ? -1 : st.peek();
            
            st.push(i);
        }
        
        return res;
    }
    
    public int[] nextRightMin(int[] arr, int n){
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        
        for(int i = n - 1; i >= 0; i--){
            while(!st.isEmpty() && arr[i] <= arr[st.peek()])
                st.pop();
            
            res[i] = (st.isEmpty()) ? n : st.peek();
            
            st.push(i);
        }
        
        return res;
    }
}
