package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
				// 3.  Use an if statement to check if their answer is correct
		String Q1 = JOptionPane.showInputDialog("Whats 10+9");
		if (Q1.equals ("21")) {
		JOptionPane.showMessageDialog(null, "Corect");	
		score ++;
		}
		else {
			JOptionPane.showMessageDialog(null, "incorect");	
		}
		String Q2 = JOptionPane.showInputDialog("Disney+ vs Youtube");
		if (Q2.equals ("Youtube")) {
		JOptionPane.showMessageDialog(null, "Corect");	
		score ++;
		}
		else {
			JOptionPane.showMessageDialog(null, "incorect");	
		}
		String Q3 = JOptionPane.showInputDialog("Who is better Dream or Tecno");
		if (Q3.equals ("Both Both is Good")) {
		JOptionPane.showMessageDialog(null, "Corect");	
		score ++;
		}
		else {
			JOptionPane.showMessageDialog(null, "incorect");	
		}
		JOptionPane.showMessageDialog(null, "Your Score is "+ score);
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		
	}
}
