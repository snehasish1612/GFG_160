class Solution {
    public int myAtoi(String s) {
        // Your code here
        int i = 0, n = s.length();
        int sign = 1;
        long result = 0;
        
        while(i < n && s.charAt(i) == ' '){
            i++;
        }
        
        if(i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')){
            if(s.charAt(i) == '-')
                sign = -1;
            i++;
        }
        
        while(i < n && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0';
            result = result * 10 + digit;
            i++;
            
            if(sign == 1 && result > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            
            if(sign == -1 && -result < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
        }
        
        return (int) (result * sign);
        
    }
}
