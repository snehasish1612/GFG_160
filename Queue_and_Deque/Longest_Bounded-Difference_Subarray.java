class Solution {
    public ArrayList<Integer> longestSubarray(int[] arr, int x) {
        // code here
        Deque<Integer> minQueue = new ArrayDeque<>();
        Deque<Integer> maxQueue = new ArrayDeque<>();
        
        int n = arr.length, start = 0, end = 0;
        int resStart = 0, resEnd = 0;
        
        while(end < n){
            while(!minQueue.isEmpty() && arr[minQueue.peekLast()] > arr[end])
                minQueue.pollLast();
                
            while(!maxQueue.isEmpty() && arr[maxQueue.peekLast()] < arr[end])
                maxQueue.pollLast();
                
            minQueue.addLast(end);
            maxQueue.addLast(end);
            
            while(arr[maxQueue.peekFirst()] - arr[minQueue.peekFirst()] > x){
                if(start == maxQueue.peekFirst())
                    maxQueue.pollFirst();
                    
                if(start == minQueue.peekFirst())
                    minQueue.pollFirst();
                    
                start++;
            }
            
            if(end - start > resEnd - resStart){
                resEnd = end;
                resStart = start;
            }
            
            end++;
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = resStart; i <= resEnd; i++)
            result.add(arr[i]);
            
        return result;
    }
}
