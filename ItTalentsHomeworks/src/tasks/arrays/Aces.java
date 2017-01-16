package tasks.arrays;

public class Aces {
	public static void main(String[] args) {
		
		int deck = 52;
		double pair = 4;
		double pocketPairChanceIntPercentage = 0;
		double twoPocketsInARow = 0;
		
		pocketPairChanceIntPercentage = (pair / deck)*((pair - 1) / (deck - 1))*100;
		twoPocketsInARow = Math.pow((100 / pocketPairChanceIntPercentage) - 1, 2);
		
		System.out.println((int)twoPocketsInARow);
					
	}
}
