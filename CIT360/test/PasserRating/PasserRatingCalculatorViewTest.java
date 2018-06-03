/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PasserRating;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author reddo
 */
public class PasserRatingCalculatorViewTest {
    
    public PasserRatingCalculatorViewTest() {
    }

    /**
     * Test of calculate method, of class PasserRatingCalculatorView.
     */
    @Test
    public void testCalculate() {
        System.out.println("calculate");
        double passAttempts = 200;
        double passCompletions = 200;
        double passYards = 2000;
        double touchdowns = 20;
        double interceptions = 0;
        double expectedResult = 141.67;
        PasserRatingCalculatorView instance = new PasserRatingCalculatorView();
        double result = instance.calculate(passAttempts, passCompletions, passYards, touchdowns, interceptions);
        assertEquals(expectedResult, result, .01);
    }
    
}
