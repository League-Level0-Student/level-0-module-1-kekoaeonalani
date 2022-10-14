package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
String quincy = "Quincy ate a smushed banana off of the dirty cafateria floor.";
String nancy = " Nancy can do a backflip on the concrete.";
String belle = "Belle is the fastets runner in the class.";
		// 2. Ask the user to enter a name. Store their answer in a variable.
String ask = JOptionPane.showInputDialog("Type in either Belle, Nancy, or Quincy.");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
if (ask.equals("Belle")) {
	JOptionPane.showMessageDialog(null, belle);
}
if (ask.equals("Quincy")) {
	JOptionPane.showMessageDialog(null, quincy);
}
if (ask.equals("Nancy")) {
	JOptionPane.showMessageDialog(null, nancy);
}
	}
}

