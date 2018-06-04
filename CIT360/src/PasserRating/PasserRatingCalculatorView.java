package PasserRating;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author reddo
 */
public class PasserRatingCalculatorView {
    void calculate(double passAttempts, double passCompletions, double passYards, double touchdowns, double interceptions) {
        // Calculate the completions per attempt score
        double portionA = ((passCompletions / passAttempts) - .3) * 5;

        // calculate the yards per attemt score
        double portionB = ((passYards / passAttempts) - 3) * .25 ;

        // calculate the touchdowns per attempt score
        double portionC = (touchdowns / passAttempts) * 20;

        // calculate the interceptions per attempt score
        double portionD = 2.375 - ((interceptions / passAttempts) * 25);

        // pre define variables to set their data type
        double portionAAdjusted;
        double portionBAdjusted;
        double portionCAdjusted;
        double portionDAdjusted;	

        // completions per attempt value must be between 0 and 2.375
        if (portionA > 2.375) {
                        portionAAdjusted = 2.375;
                } else if (portionA < 0) {
                        portionAAdjusted = 0;
                } else {
                        portionAAdjusted = portionA;
                }

        // yards per attempt value must be between 0 and 2.375
        if (portionB > 2.375) {
                        portionBAdjusted = 2.375;
                } else if ( portionB < 0) {
                        portionBAdjusted = 0;
                } else {
                        portionBAdjusted = portionB;
                }

        // touchdowns per attempt value must be less than 2.375	
        if (portionC > 2.375) {
                        portionCAdjusted = 2.375;
                } else {
                        portionCAdjusted = portionC;
                }

        // interceptions per attempt value must be greater than 0		
        if ( portionD < 0) {
                        portionDAdjusted = 0; 
                } else {
                        portionDAdjusted = portionD;
                }

        // calculate passer rating, round to two digits
        double passerRating = (double) Math.round(((( portionAAdjusted + portionBAdjusted + portionCAdjusted + portionDAdjusted) / 6) * 100) * 100) / 100 ;

        // display passer rating to the console
        System.out.println("\n**************************************************"
                                                + "***************************");
        System.out.println("\t The Passer Rating is " + passerRating);
        System.out.println("\n**************************************************"
                                                + "***************************");
    }
}
