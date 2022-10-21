package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String riddleOne = JOptionPane.showInputDialog("Who makes it, has no need of it.\n" + 
		"Who buys it, has no use for it. \n" + 
		"Who uses it can neither see nor feel it. \n" + 
		"What is it?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (riddleOne.equals("a coffin")){
	JOptionPane.showMessageDialog(null, ("Correct!"));
	score += 1;
}

		// 5. Otherwise, say "wrong" and tell them the answer
else {
	JOptionPane.showMessageDialog(null, "Wrong. The answer is a coffin.");
}
		// 6. Add some more riddles
String riddleTwo = JOptionPane.showInputDialog("I am an odd number. Take away a letter, and I am even. what number am I?");

if (riddleTwo.equals("seven")) {
	JOptionPane.showMessageDialog(null, "Wow! Correct.");
	score += 1;
}
else {
	JOptionPane.showMessageDialog(null,"Nope. The answer is the number seven.");
}

String riddleThree = JOptionPane.showInputDialog("What runs all around a backyard, yet never moves?");
if (riddleThree.equals("a fence")) {
	JOptionPane.showMessageDialog(null,"WOW! You got it right!");
	score += 1;
}
else {
	JOptionPane.showMessageDialog(null,"EEK. Wrong.");

}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Your score is: " + score);
	}
}

