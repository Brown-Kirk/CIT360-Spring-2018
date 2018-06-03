package PasserRating;

 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 import java.util.Scanner;
import PasserRating.PasserRatingCalculator; 
public class PasserRatingCalculator {
	
	/**
	 * The program starts in the main function
	 * @param args the command line arguments
	 */
	 
	 public static void main(String[] args) {
	 
		// print out the welcome message
		System.out.println();
		System.out.println("This program calculates a quarterback's passer rating using the NFL/CFL formula");
			
		// create an input file for the console
		Scanner inFile;
		inFile = new Scanner(System.in);
		
		// prompt user to enter the number of pass attempts
		System.out.println("\nEnter the number of passes attempted:");
		double passAttempts = inFile.nextDouble(); // get pass attempts entered from console

		System.out.println("\nEnter the number of passes completed:");
		double passCompletions = inFile.nextDouble(); //get the next line typed from the console
				
		// prompt user to enter the number of passing yards
		System.out.println("\nEnter the number of passing yards:");
		double passYards = inFile.nextDouble(); // get passing yards entered from console
		
		// prompt user to enter the number of touchdowns
		System.out.println("\nEnter the number of touchdowns:");
		double touchdowns = inFile.nextDouble(); // get touchdowns entered from console
		
		// prompt user to enter the number of interceptions
		System.out.println("\nEnter the number of interceptions:");
		double interceptions = inFile.nextDouble(); // get touchdowns entered from console
		PasserRatingCalculatorView calculator = new PasserRatingCalculatorView();
                double result = calculator.calculate(passAttempts, passCompletions, passYards, touchdowns, interceptions);
		
	 }
}