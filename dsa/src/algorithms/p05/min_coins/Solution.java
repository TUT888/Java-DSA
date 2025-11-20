package algorithms.p05.min_coins;

public class Solution {
	// With memo
	public static int minCoins(int money, int[] coins, int[] memo) {
		if (money == 0) return 0;
		
		int min = -1;
		for (int pickedCoin : coins) {
			int remainingMoney = money-pickedCoin;
			if (remainingMoney < 0) continue;
			
			int minCoin = memo[remainingMoney] != 0 ? memo[remainingMoney] : minCoins(remainingMoney, coins, memo);
			if (minCoin == -1) continue;
			memo[remainingMoney] = minCoin;
			
			if (min == -1) {
				min = minCoin + 1;
			} else {
				min = Math.min(min, minCoin + 1);
			}
		}
		
		return min;
	}
	
	// Without memo
	public static int minCoins(int money, int[] coins) {
		if (money == 0) return 0;
		
		int min = -1;
		for (int pickedCoin : coins) {
			int remainingMoney = money-pickedCoin;
			if (remainingMoney < 0) continue;
			
			int minCoin = minCoins(remainingMoney, coins);
			if (minCoin == -1) continue;
			
			if (min == -1) {
				min = minCoin + 1;
			} else {
				min = Math.min(min, minCoin + 1);
			}
		}
		
		return min;
	}
}
