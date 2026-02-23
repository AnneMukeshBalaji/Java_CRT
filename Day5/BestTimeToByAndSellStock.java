package Day5;

public class BestTimeToByAndSellStock {
  public int maxProfit(int[] prices) {
    int left = 0;
    int profit = 0;
    for (int i = 1; i <= prices.length - 1; i++) {
      if (prices[i] > prices[left]) {
        profit = Math.max(profit, prices[i] - prices[left]);
      } else {
        left = i;
      }
    }
    return profit;
  }

  public static void main(String[] args) {
    int[] prices = { 7, 2, 3, 4, 1 };
    BestTimeToByAndSellStock obj = new BestTimeToByAndSellStock();
    int result = obj.maxProfit(prices);
    System.out.print("Elements in the Array : ");
    for (int i : prices) {
      System.out.print(i + " ");
    }
    System.out.println();
    System.out.println("The Profit for The array is : " + result);
  }
}
