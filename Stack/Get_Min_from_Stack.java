class Solution {
    public Solution() {
        st = new Stack<>();
        minSt = new Stack<>();
    }
    
    Stack<Integer> st;
    Stack<Integer> minSt;
    
    // Add an element to the top of Stack
    public void push(int x) {
        // code here
        st.push(x);
        
        if(minSt.isEmpty() || x < minSt.peek())
            minSt.push(x);
    }

    // Remove the top element from the Stack
    public void pop() {
        
        // code here
        if(st.isEmpty())
            return;
        
        int removed = st.pop();
        
        if(removed == minSt.peek())
            minSt.pop();
    }

    // Returns top element of the Stack
        
    public int peek() {
        // code here
        if(st.isEmpty())
            return -1;
            
        return st.peek();
    }

        
    // Finds minimum element of Stack
    public int getMin() {
        // code here
        if(st.isEmpty())
            return -1;
            
        return minSt.peek();
    }
}
