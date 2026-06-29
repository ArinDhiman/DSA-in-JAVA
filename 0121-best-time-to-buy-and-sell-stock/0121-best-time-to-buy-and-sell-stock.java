class Solution {
    public int maxProfit(int[] prices) {
        int minPrices=prices[0];
        int maxPrice=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<minPrices){
                minPrices=prices[i];
            }
            int profit=prices[i]-minPrices;
            if(profit>maxPrice){
                maxPrice=profit;
            }
        }
        return maxPrice;
    }
}