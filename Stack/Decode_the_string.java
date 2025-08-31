
class Solution {
    static String decodeString(String s) {
        // code here
        Stack<Integer> numberStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        int digit = 0;
        
        //Traverse the String
        for(char ch : s.toCharArray()){
            
            //When the character is digit
            if(Character.isDigit(ch)){
                int k = ch - '0';
                digit = digit * 10 + k;
                continue;
            }
            
            //When the character is '['
            if(ch == '['){
                numberStack.push(digit);
                digit = 0;
                
                stringStack.push(String.valueOf(ch));
                continue;
            }
            
            //When the character is an alphabet
            if(ch != ']'){
                stringStack.push(String.valueOf(ch));
                continue;
            }
            
            //When the character is ']'
            StringBuilder temp1 = new StringBuilder();  //For storing the poped characters
            while(!stringStack.peek().equals("[")){
                temp1.insert(0, stringStack.pop());
            }
            
            stringStack.pop();  //Remove '[' from the stringStack
            int repeat = numberStack.pop();
            
            StringBuilder temp2 = new StringBuilder();  //For storing the repeating characters
            
            for(int i = 0; i < repeat; i++){
                temp2.append(temp1);
            }
            
            stringStack.push(temp2.toString()); //Push the correct string again into the stringStack 
        }
        
        StringBuilder result = new StringBuilder();
        while(!stringStack.isEmpty()){
            result.insert(0, stringStack.pop());
        }
        
        return result.toString();
    }
}
