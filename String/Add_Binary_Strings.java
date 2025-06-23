// User function Template for Java

class Solution {
    public String addBinary(String s1, String s2) {
        // code here
        StringBuilder result = new StringBuilder();
        int i = s1.length() - 1, j = s2.length() - 1, carry = 0;
        
        while(i >= 0 || j >=0 || carry == 1){
            int bitA = (i >= 0) ? s1.charAt(i) - '0' : 0;
            int bitB = (j >= 0) ? s2.charAt(j) - '0' : 0;
            
            int sum = bitA + bitB + carry;
            
            result = result.append(sum % 2);
            carry = sum / 2;
            
            i--;
            j--;
        }
        
        String finalResult =  result.reverse().toString();
        
        int index = 0;
        while(index < finalResult.length() - 1 && finalResult.charAt(index) == '0'){
            index++;
        }
        
        return finalResult.substring(index);
    }
}
