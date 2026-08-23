package main.java.com.samarth.revision.two;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        BestTimeToBuyAndSellStock sol = new BestTimeToBuyAndSellStock();
        int[] prices = new int[]{3, 5, 15, 1, 20};
        System.out.println(sol.maxProfit(prices));
    }

    public int maxProfit(int[] prices) {
        int max = 0;
        int buyPrice = prices[0];
        for (int currPrice: prices) {
           if (currPrice > buyPrice) {
               max = Math.max(max, currPrice - buyPrice);
           } else {
               buyPrice = currPrice;
           }
        }
        return max;
    }
}


