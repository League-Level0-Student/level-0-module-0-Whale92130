package _03_print_and_popups._2_madlibs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		String prompt =  "If you find yourself having to cross a piranha-infested river, here's how to do it...";
		JOptionPane.showMessageDialog(null, " "+ prompt);  
		// Get the player to enter an adjective
		String adj = JOptionPane.showInputDialog("Enter an Adjective");
		
		// Get the player to enter a type of liquid
		String liquid = JOptionPane.showInputDialog("Enter a Type of Liquid");
		// Get the player to enter a body part
		String bodyPart = JOptionPane.showInputDialog("Enter a Body Part");	
		// Get the player to enter a verb
		String verb = JOptionPane.showInputDialog("Enter a Verb");
		// Get the player to enter a place
		String place = JOptionPane.showInputDialog("Enter a Place");
		// The story below has has been written as a group of Strings joined together by + signs.
		// The story contains place holders, indicated by [** **] which you need to replace with
		// the values entered by the player.
		// Hint:  You will need to add more + signs to join the variables to the other parts of the story.
		
		
		
		
		
		String story = 
		"Piranhas are more "+adj+" during the day, so cross the river at\n"  +
		"night. Piranhas are attracted to fresh "+liquid+" and will most\n"  +
		"likely take a bite out of your "+bodyPart+" if you "+verb+". Whatever\n"  +
		"you do, if you have an open wound, try to find another way to get\n"  +
		"back to the "+place+". Good luck!";
		
		
		JOptionPane.showMessageDialog(null, story);
		
		// Make a pop-up that contains the final story. The \n escape characters add line breaks to the story. 
		// If you need to, move them around to make your story look better in the pop-up
		
		// If you want to write your own Madlib story, just change the story variable and ask the player different questions.

	

	}


}