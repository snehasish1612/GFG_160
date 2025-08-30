class Solution {
    public int[] singleNum(int[] arr) {
        // Code here
        int xor = 0;
        for(int num : arr)
            xor ^= num;
            
        int setBit = xor & -xor;
        
        int x = 0, y = 0;
        for(int num : arr){
            if((num & setBit) != 0)
                x ^= num;
            else
                y ^= num;
        }
        
        return new int[]{
            Math.min(x, y), Math.max(x, y)
        };
    }
}
