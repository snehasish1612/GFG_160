class Solution {
    static int maxLength(String s) {
        // code here
        Stack<Integer> st = new Stack<>();
        
        st.push(-1);
        int maxLen = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(')
                st.push(i);
            else{
                st.pop();
                
                if(!st.isEmpty())
                    maxLen = Math.max(maxLen, (i - st.peek()));
                else{
                    st.push(i);
                }
            }
        }
        
        return maxLen;
    }
}
