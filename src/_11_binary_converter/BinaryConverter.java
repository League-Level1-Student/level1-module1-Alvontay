package _11_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	
	JFrame frame = new JFrame("Convert 8 bits of binary to ASCII");
	JPanel panel = new JPanel();
	JButton button = new JButton("Convert");
	JLabel label = new JLabel("Answer :");
	JTextField textField = new JTextField(20);
	String answer;

	public static void main(String[] args) {
		
		 new BinaryConverter().makeGUI();
		
	}
	
	public void makeGUI() {
		
		panel.add(textField);
		panel.add(button);
		panel.add(label);
		
		frame.add(panel);
		
		frame.pack();
		
		frame.setVisible(true);
		
		button.addActionListener(this);

	}
	
	String convert(String input) {
	    if(input.length() != 8){
	        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
	        return "-";
	    }
	    String binary = "[0-1]+";//must contain numbers in the given range
	    if (!input.matches(binary)) {
	        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
	        return "-";   
	    }
	    try {
	        int asciiValue = Integer.parseInt(input, 2);
	        char theLetter = (char) asciiValue;
	        return "" + theLetter;
	    } catch (Exception e) {
	        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
	        return "-";
	    }
	}                            

	public void actionPerformed(ActionEvent e) {
		
		answer = convert(textField.getText());
		
		label.setText(answer);
		
	}

}