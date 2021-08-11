package _04_amazing_games._2_dragon_fight;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {

	public static void main(String[] args) {

		Random ran = new Random();    //This will be used later to make random numbers. 

		ImageIcon dragon = new ImageIcon("src/_04_amazing_games/_2_dragon_fight/dragonPicture.jpg");
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);

		// 1. Create some variables to hold health levels
		int Php = 100;
		int Dhp = 100;
			// playerHealth to store your health - set it equal to 100
		
			// dragonHealth to store the dragon's health - set it equal to 100

		// 2. Create some variables to hold the attack strengths. These will be given different values later. 
		int Patck = 0;
		int Datck = 0;
			// playerAttack to store the damage the player's attack will do - set it equal
			// to 0 for now.
	
			// dragonAttack to store the damage the dragon's attack will do - set it equal
			// to 0 for now.

		
		//  This while statement will cause the game attack code to repeat
		while (true) {

			// THE PLAYER ATTACKS THE DRAGON
			System.out.println("A dragon has attacked you");
			String Q1 = JOptionPane.showInputDialog("Do you want to yell or kick");
				// 3. Ask the player in a pop-up if they want to attack the dragon with a yell
				// or a kick
	
				// 4. If they typed in "yell":
			if (Q1.equals("yell")) {
				Patck = ran.nextInt(10);
			}
			if (Q1.equals("kick")) {
				Patck = ran.nextInt(25);
			}
					  // -- Find a random number between 0 and 10 and store it in playerAttack. Use
					  // ran.nextInt(10)
			
				// 5. If they typed in "kick":
	
					  // -- Find a random number between 0 and 25 and store it in playerAttack.
			System.out.println("The Dragon RETALIATES");
				// 6. Subtract the player attack value from the dragon's health
			Dhp = (Dhp - Patck);
			// THE DRAGON RETALIATES

				// 7. Find a random number between 0 and 35 and store it in dragonAttack
			Datck = ran.nextInt(35);
				// 8. Subtract the dragon attack value from the player's health
			Php = (Php - Datck);
			// ASSESS THE DAMAGE
			
				// 9. If the player's health is less than or equal to 0, the game is over,
				//    call the playerLost() method
			if (Php < 1) {
				playerLost();
			}
			
				// 10. If the dragon's health is less than or equal to 0, the game is over,
				//     call the dragonLost() method
			if (Dhp < 1) {
				dragonLost();
			}
			
				// 11.  Pop up a message that tells us how much health the player and
				// 		dragon have left.
			JOptionPane.showMessageDialog(null, "The Dragon has "+Dhp + " health left");
			
			// (Bonus: Also display the amount of health that was lost by each in this
			// round)
			JOptionPane.showMessageDialog(null, "You have "+Php + " health left");

		} // this is the end of the while loop

	}

	static void playerLost() {
		// 11. Tell the player that they have been defeated by the dragon and have no treasure
		System.out.println("You have no treasure");

		System.exit(0);   //This code ends the program
	}

	static void dragonLost() {
		// 12. Tell the user that the dragon has been defeated and they get a ton of gold!
		System.out.println("you have won and earned a lot of gold");
		System.exit(0);   //This code ends the program
	}

}
