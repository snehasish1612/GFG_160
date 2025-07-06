// User function Template for Java

class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i : a){
            arr.add(i);
        }
        
        for(int i : b){
            arr.add(i);
        }
        
        Collections.sort(arr);
        
        return arr.get(k - 1);
    }
}
