package com.soban;

/**
 * @author Soban
 * date 02/12/2024
 * Calculates the number of remaining cupcakes after distributing them equally among students in a class.
 */
import java.util.Scanner;

public class CupcakeParty {
	/**
	 * Main method
	 * @param args Command line arguments
	 */
	public static void main(String[] args) {
		
		// Number of students in the class
		int classStudents = 28;
		
		// Create a Scanner object to read user input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount of regular boxes");
		System.out.print("> ");
		int reg = input.nextInt(); // Number of regular boxes
		System.out.println(reg);

		// Prompt the user to enter the number of small cupcake boxes
		System.out.println("Enter the amount of small boxes");
		System.out.print("> ");
		int sml = input.nextInt();

		// Calculate the total number of cupcakes
		int totalCupcakes = reg * 8 + sml * 3;
		
		// Calculate the number of remaining cupcakes after distribution
		int cupcakesRemain = totalCupcakes % classStudents;

		// Print the number of remaining cupcakes
		System.out.println(cupcakesRemain);
	}
}