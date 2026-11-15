class Solution {
    public int maxProfit(int[] prices) {

        int dif = 0;
        for(int i =1;i<prices.length;i++){
            if(prices[i] > prices[i-1] ){
            dif += prices[i] - prices[i-1];
            }        
        }


    return dif;



    }
}
