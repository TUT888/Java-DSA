package dsa12.min_coins;

public class Main {
	public static void main(String[] args) {
		int[] coins = {4, 5};
		int money = 13;
		System.out.println(Solution.minCoins(money, coins, new int[money+1]));
		
		money = 3;
		System.out.println(Solution.minCoins(money, coins, new int[money+1]));
		money = 10;
		System.out.println(Solution.minCoins(money, coins, new int[money+1]));
		money = 13;
		System.out.println(Solution.minCoins(money, coins, new int[money+1]));
		money = 1658;
		System.out.println(Solution.minCoins(money, coins, new int[money+1]));
		money = 5156;
		System.out.println(Solution.minCoins(money, coins, new int[money+1]));
	}
}
