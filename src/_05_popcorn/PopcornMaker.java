package _05_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String[] args) {
		
		Popcorn popcorn = new Popcorn(JOptionPane.showInputDialog("What flavor do you want your popcorn to be?"));
		
		Microwave microwave = new Microwave();
		
		microwave.putInMicrowave(popcorn);
		
		String cookingQuestion = JOptionPane.showInputDialog("how long do you want to cook your popcorn? (In minutes) ");
		
		microwave.setTime(Integer.parseInt(cookingQuestion));
		
		microwave.startMicrowave();
	}
}
