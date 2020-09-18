import java.util.HashMap;
import java.util.Map;

/**
 * Problem Statement : An array contains integers indicating the stock values of a company . 
 * WAP to find the maximum profit which could be made in a single buy and sell . 
 * Buy is always before sell.
 * @author samrat
 *
 */


public class StockMaxProfit {

	public static int[] stock_prices = {10,12,8,12,13,14,15,12,13,14,17,
			16,19,10,9,12,13,18,24,20,19,17,15,10,15,13,29,0};
	//{10,12,8,12,13,14,15,12,13,14,17,16,19,10,7,12,13,18,22,20,19,17,15,10,0};
	
	public static void main(String[] args) {
		System.out.println("Analysis :: " +getMaxProfitSingleBuySell(stock_prices));
	}
	
	public static Map<String,Integer> getMaxProfitSingleBuySell(int[] prices) {
		
		int profit =0;
		int minIndex=0;
		int maxprofit=0;
		int maxProfitIndex=0;
		for(int i=0;i<prices.length-2;i++) {
			int delta = prices[i+1]-prices[i];
			if(profit+delta>0) {
				profit= profit+delta;
				if(maxprofit<profit) {
					maxprofit = profit;
					maxProfitIndex=i+1;
				}
			}else {
				profit=0;
				minIndex=i+1;
			}
		}
		Map<String,Integer> values = new HashMap<String, Integer>();
		values.put("MaxProfit", maxprofit);
		values.put("MinIndex", minIndex);
		values.put("MaxIndex", maxProfitIndex);
		return values;
		
	}
	
}
