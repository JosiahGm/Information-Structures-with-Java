package cs520.hw2.part1;

import javax.swing.JOptionPane;

public class TuitionProceduralStyle {
	
	public static void main(String[] args){
	
		//Create data types that user will be prompted to give value
		String courseName1, courseName2;
		int numCredits1, numCredits2;
		int costPerCredit1, costPerCredit2;
		
		//Create data type that will be calculated with user-given values
		int courseTuition1, courseTuition2;
	
		//prompt user to enter course name, number of credits and cost per credit for course 1
		courseName1 = JOptionPane.showInputDialog("Enter the name of the first course: ");

		numCredits1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of credits for the"
				+ " first course: "));
	
		costPerCredit1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the cost per credit"
				+ " for the first course: "));
		
		//Calculate tuition for first course
		courseTuition1 = numCredits1 * costPerCredit1;
		
		//Display first course info
		JOptionPane.showMessageDialog(null, "First course name: " + courseName1 + "\n"
				+ "Tuition for first course: " + courseTuition1);
		
		//prompt user to enter course name, number of credits and cost per credit for course 2				
		courseName2 = JOptionPane.showInputDialog("Enter the name of the second course: ");
		
		numCredits2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of credits for the"
						+ " second course: "));
		
		costPerCredit2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the cost per credit"
						+ " for the second course: "));
	
		//calculate tuition for second course	
		courseTuition2 = numCredits2 * costPerCredit2;
		
		//Display second course info
		JOptionPane.showMessageDialog(null, "Second course name: " + courseName2 + "\n"
				+ "Tuition for second course: " + courseTuition2);
		
		//Use conditional statement to determine which tuition is higher or if they are the same
		if (courseTuition1 > courseTuition2){
			JOptionPane.showMessageDialog(null, courseName1 + " has a higher tuition than "
					+ courseName2);
		}
		else if (courseTuition1 < courseTuition2){
			JOptionPane.showMessageDialog(null, courseName2 + " has a higher tuition than "
					+ courseName1);
		}
		else JOptionPane.showMessageDialog(null, "The courses have the same tuition cost.");
		
	}	
	
}
