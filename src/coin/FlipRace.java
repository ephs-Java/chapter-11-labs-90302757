package coin;

public class FlipRace {
	// -----------------------------------------------------------------
	// Flips two coins until one of them comes up heads three times in a row.
	// -----------------------------------------------------------------
	public static void main(String[] args) {
		Coin a = new Coin();
		Coin b = new Coin();
		int count = 0;
	
			// Create two separate coin objects
		while(count != 3){
			a.flip();
			b.flip();
			if(a.isHeads() || b.isHeads()){
				count++;
			}
			else {
				count = 0;
			}
			System.out.println("Results:");
			System.out.println(a.toString());
			System.out.println(b.toString());
		}
			// Print the flip results (uses Coin's toString method)
		
			//stop the flipping once one of the coins gets to heads, 3 times in a row
		
		
	
	}
}