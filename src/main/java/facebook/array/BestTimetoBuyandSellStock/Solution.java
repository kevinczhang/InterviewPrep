package facebook.array.BestTimetoBuyandSellStock;

public class Solution {
	public int maxProfit(int[] prices) {
		if (prices.length <= 1)
			return 0;

		int minPrice = prices[0], maxProfit = 0, curProfit;
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] > minPrice) {
				curProfit = prices[i] - minPrice;
				maxProfit = (maxProfit > curProfit) ? maxProfit : curProfit;
			} else if (prices[i] < minPrice){
				minPrice = prices[i];
			}
		}
		return maxProfit;
	}
}
