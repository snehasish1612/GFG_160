
class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> prevHigh = new Stack<>();
        
        for(int i = 0; i < arr.length; i++){
            while(!prevHigh.isEmpty() && arr[i] >= arr[prevHigh.peek()]){
                prevHigh.pop();
            }
             
            if(prevHigh.isEmpty()){
                result.add(i + 1);
                prevHigh.push(i);
                continue;
            }
                
            result.add(i - prevHigh.peek());
            prevHigh.push(i);
        }
        
        return result;
    }
}
