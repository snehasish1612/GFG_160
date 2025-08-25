
class Solution {
    static boolean isMatch(char ch1, char ch2){
        if(ch1 == '(' && ch2 == ')')
            return true;
        else if(ch1 == '{' && ch2 == '}')
            return true;
        else if(ch1 == '[' && ch2 == ']')
            return true;
        else
            return false;
    }
    
    static boolean isBalanced(String s) {
        // code here
        Set<Character> openingSet = new HashSet<>();
        openingSet.add('(');
        openingSet.add('{');
        openingSet.add('[');
        
        char[] ch = s.toCharArray();
        Stack<Character> st = new Stack<>();
        
        for(int i = 0; i < ch.length; i++){
            if(openingSet.contains(ch[i])){     //Opening bracket
                st.push(ch[i]);
            }else{                              //Closing bracket
                if(st.isEmpty()){
                    return false;
                }
                
                if(isMatch(st.peek(), ch[i])){
                    st.pop();
                }else{
                    return false;
                }
            }
        }
        
        return st.isEmpty();
    }
}
