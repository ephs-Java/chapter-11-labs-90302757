package coin;

public class CountFlips {
	// -----------------------------------------------------------------
	// Flips a coin multiple times and counts the number of heads
	// and tails that result.
	//		Output:
	//			The number flips: 1000
	//			The number of heads: 493
	//			The number of tails: 507
	// -----------------------------------------------------------------
	public static void main(String[] args) {
		Coin coin = new Coin();
		int flips = 1000;
		int heads = 0;
		int tails = 0;
		for(int i = 0; i < flips; i++){
			coin.flip();
			if(coin.isHeads() == true){
				heads++;
			}
			else {
				tails++;
			}
		}
		System.out.println("Output:");
		System.out.println("\tNumber of flips: " + flips );
		System.out.println("\tNumber of heads: " + heads);
		System.out.println("\tNumber of tails: " + tails);
		
		
	}
}
