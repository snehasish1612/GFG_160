// User function Template for Java

class Solution {
    public int maximumProfit(int prices[]) {
        // Code here
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for(int price: prices){
            if(price < minPrice)
                minPrice = price;
            else if(price - minPrice > maxProfit)
                maxProfit = price - minPrice;
        }
        
        return maxProfit;
    }
}
