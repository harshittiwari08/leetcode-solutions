class Solution {
    public int maxProfit(int[] prices) {
        int minPrice= Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i:prices){
            if(i< minPrice)
                minPrice= i;

            else if((i- minPrice) > maxprofit)
                maxprofit= i-minPrice;
        }
        return maxprofit;
    }
}