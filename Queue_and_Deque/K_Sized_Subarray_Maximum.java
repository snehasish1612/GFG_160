class Solution {
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        // code here
        
        //A deque to store resultant elements in descending order
        Deque<Integer> deque = new ArrayDeque<>();    
        
        //Resultant array-list
        ArrayList<Integer> result = new ArrayList<>();
        
        //Operation for the first window
        for(int i = 0; i < k; i++){
            //If the current element of the array is greater than or equals to the last item of the deque
            //Pop the last elemnt, for maintaining descending order
            while(!deque.isEmpty() && arr[i] >= arr[deque.peekLast()])
                deque.pollLast();
                
            deque.addLast(i);
        }
        
        //Operation for the rest of the windows
        for(int i = k; i < arr.length; i++){
            //Storing results in result list
            result.add(arr[deque.peekFirst()]);
            
            //Checks if the front element of the queue belongs to that window or not
            while(!deque.isEmpty() && deque.peekFirst() <= i - k)
                deque.pollFirst();
                
            //If the current element of the array is greater than or equals to the last item of the deque
            //Pop the last elemnt, for maintaining descending order
            while(!deque.isEmpty() && arr[i] >= arr[deque.peekLast()])
                deque.pollLast();
                
            deque.addLast(i);
        }
        
        //For storing the result of the last window
        result.add(arr[deque.peekFirst()]);
        
        return result;
    }
}
