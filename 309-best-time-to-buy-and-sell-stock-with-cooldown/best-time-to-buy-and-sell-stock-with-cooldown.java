class Solution {
    public int maxProfit(int[] prices){
    int buy=-prices[0];
    int sell=0;
    int cool=0;
    for(int i=1;i<prices.length;i++){
        int prevSell=sell;
        sell=Math.max(sell,buy+prices[i]);
        buy=Math.max(buy,cool-prices[i]);
        cool=prevSell;
    }
    return sell;
}
}