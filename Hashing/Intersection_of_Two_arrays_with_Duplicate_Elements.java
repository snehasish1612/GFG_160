class Solution {
    public ArrayList<Integer> intersect(int[] a, int[] b) {
        // code here
        Set<Integer> seen = new HashSet<>();
        
        for(int num : a){
            seen.add(num);
        }
        
        Set<Integer> result = new HashSet<>();
        
        for(int num : b){
            if(seen.contains(num))
                result.add(num);
        }
        
        return new ArrayList<>(result);
    }
}
