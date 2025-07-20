class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        Set<Integer> set = new HashSet<>();
        
        for(int num : arr)
            set.add(num);
        
        int result = 0;
        
        for(int num : arr){
            if(set.contains(num) && !set.contains(num - 1)){
                int curr = num, count = 0;
                while(set.contains(curr)){
                    set.remove(curr);
                    curr++;
                    count++;
                }
                result = Math.max(result, count);
            }
        }
        
        return result;
    }
}
