class Solution {
    public int maxProfit(int[] prices) {
         int profit=0;
        int maxProfit=0;

        // TODO: This solution works for small inputs as it is in O(n*n), needs better time complexity like O(n*logn)
        for(int i =0; i<=prices.length-1;i++){
            for(int j=i+1;j<=prices.length-1;j++){
                if(prices[j]-prices[i]>0){
                    profit=prices[j]-prices[i];
                    maxProfit = Math.max(profit, maxProfit);
                }   
            }
        }
        return maxProfit;
    }
}
