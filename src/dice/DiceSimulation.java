package dice;

//This class simulates rolling a pair of dice 10,000 times and
//counts the number of times doubles of are rolled for each
//different pair of doubles.
public class DiceSimulation {
	public static void main(String[] args) {
		final int NUMBER = 10000; // the number of times to roll the dice
		
		// create 2 Dice objects, die1 and die2
	
		
		int count = 10000; // number of times the dice were rolled
		int snakeEyes = 0; // number of times snake eyes is rolled
		int twos = 0; // number of times double two is rolled
		int threes = 0; // number of times double three is rolled
		int fours = 0; // number of times double four is rolled
		int fives = 0; // number of times double five is rolled
		int sixes = 0; // number of times double six is rolled

		// create 2 dice, roll them 10000 times, and keep track of the doubles.
		Dice a = new Dice();
		Dice b = new Dice();
		for(int i = 0; i < count; i++){
			a.roll();
			b.roll();
			if(a.spots == 1 && b.spots == 1){
				snakeEyes++;
			}
			else if(a.spots == 2 || b.spots == 2){
				if(a.spots == b.spots){
					twos += 2;
				}
				else {
					twos++;
				}
			}
			else if(a.spots == 3 || b.spots == 3){
				if(a.spots == b.spots){
					threes += 2;
				}
				else {
					threes++;
				}
			}
			else if(a.spots == 4 || b.spots == 4){
				if(a.spots == b.spots){
					fours += 2;
				}
				else {
					fours++;
				}
			}
			else if(a.spots == 5 || b.spots == 5){
				if(a.spots == b.spots){
					fives += 2;
				}
				else {
					fives++;
				}
			}
			else if(a.spots == 6 || b.spots == 6){
				if(a.spots == b.spots){
					sixes += 2;
				}
				else {
					sixes++;
				}
			}
		}
		// what method(s) do you need to write in the Dice class to make this work?
		
		
		// preformatted output to be used after the 10000 rolls above.
		System.out.println("You rolled snake eyes " + snakeEyes + " out of " + count + " rolls.");
		System.out.println("You rolled double twos " + twos + " out of " + count + " rolls.");
		System.out.println("You rolled double threes " + threes + " out of " + count + " rolls.");
		System.out.println("You rolled double fours " + fours + " out of " + count + " rolls.");
		System.out.println("You rolled double fives " + fives + " out of " + count + " rolls.");
		System.out.println("You rolled double sixes " + sixes + " out of " + count + " rolls.");
	}
}
