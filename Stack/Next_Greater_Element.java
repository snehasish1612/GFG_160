class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        
        for(int i = arr.length - 1; i >= 0; i--){
            while(!st.isEmpty() && arr[i] >= st.peek())
                st.pop();
                
            if(st.isEmpty())
                result.add(-1);
            else
                result.add(st.peek());
                
            st.push(arr[i]);
        }
        Collections.reverse(result);
        return result;
    }
}
