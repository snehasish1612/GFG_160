// User function Template for Java
class Solution {
    public List<List<Integer>> findTriplets(int[] arr) {
        // Your code here
        int n = arr.length;
        Set<List<Integer>> tripletSet = new HashSet<>();
        
        for(int i = 0; i < n - 2; i++){
            Set<Integer> seen = new HashSet<>();
            for(int j = i + 1; j < n; j++){
                int third = -(arr[i] + arr[j]);
                if(seen.contains(third)){
                    for(int k = i + 1; k < j; k++){
                        if(arr[k] == third){
                            List<Integer> triplet = Arrays.asList(i, j, k);
                            Collections.sort(triplet);
                            tripletSet.add(triplet);
                        }
                    }
                }
                seen.add(arr[j]);
            }
        }
        
        return new ArrayList<>(tripletSet);
    }
}
