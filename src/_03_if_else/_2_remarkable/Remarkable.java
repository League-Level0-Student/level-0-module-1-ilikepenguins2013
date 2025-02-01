package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
	String jay = "you are good at math";
	String jonni = "you are good at capping";
	String isaac = "you are good at coding";
		// 2. Ask the user to enter a name. Store their answer in a variable.
	String name = JOptionPane.showInputDialog("what is your name");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
	if(name.equalsIgnoreCase("jay")) {
		JOptionPane.showMessageDialog(null, jay);
	}
	else if(name.equalsIgnoreCase("jonni")) {
		JOptionPane.showMessageDialog(null, jonni);
	}
	else if(name.equalsIgnoreCase("isaac")) {
		JOptionPane.showMessageDialog(null, isaac);
	}
	}
}

