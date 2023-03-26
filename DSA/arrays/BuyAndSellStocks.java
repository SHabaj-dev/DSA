package arrays;

/*
Problem Links
GFG -> https://practice.geeksforgeeks.org/problems/stock-buy-and-sell-1587115621/1
Leetcode -> https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
code studio -> https://www.codingninjas.com/codestudio/problems/stocks-are-profitable_893405
 */
public class BuyAndSellStocks {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int[] prices) {
        int mini = prices[0];
        int maxProfit = 0;
        int n = prices.length;
        for(int i = 0; i < n; i++){
            int cost = prices[i] - mini;
            maxProfit = Math.max(maxProfit, cost);
            mini = Math.min(mini, prices[i]);
        }
        return maxProfit;
    }
}
