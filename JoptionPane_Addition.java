package Assignment_1;

import javax.swing.JOptionPane;

/*
 * Addition of integers example using JOptionPane
 */
public class JoptionPane_Addition {

	public static void main(String[] args) {
	
		// Declare variables
		String s1,s2;
		int num1, num2,sum;
		
		s1= JOptionPane.showInputDialog("Enter the First number");
		s2=  JOptionPane.showInputDialog("Enter the second number");
		
		num1 = Integer.parseInt(s1);
		num2 = Integer.parseInt(s2);
		
		//add two numbers together
		sum = num1+num2;
		JOptionPane.showMessageDialog(null,"The sum of "+num1+" and "+num2+" is "+sum);
		System.exit(0);

	}

}
