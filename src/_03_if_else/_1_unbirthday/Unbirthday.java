package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {

	public static void main(String[] args) {
		String userBirthday = JOptionPane.showInputDialog("what is your birthday");
		if(userBirthday.equals("1/31")) {
			JOptionPane.showMessageDialog(null, "happy birthday");
		}
		else {
			JOptionPane.showMessageDialog(null, "very un happy b-day to you");
		}

	}

}
