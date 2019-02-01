
public class DiceClass {

	public static void main(String[] args){
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		
		for(int i =0; i <10; i++)
		{
			System.out.println(dice1.Roll());
			
		}
		System.out.println("Dice 1 has rolled: " + dice1.getNumRolls() + " times.");
		

	}

}
