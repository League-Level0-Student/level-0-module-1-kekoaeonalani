package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	String date = JOptionPane.showInputDialog("What date is your birthday?");
	if (date.equals("10/13")) {
		JOptionPane.showMessageDialog(null, "HAPPY BIRTHDAY!");
	}
	
	else {
		JOptionPane.showMessageDialog(null, "Happy UNbirthday!");
	}
	
}
}
