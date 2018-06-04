/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360;


import java.math.BigDecimal;
import java.util.*;


public class Sample {

    

public int add(int a, int b) {
        
    int sum = a + b;
        
    return sum;

}      

public boolean returnFalse() {
    	
    boolean a = false;
	
	return a;
    	
    }

public BigDecimal createBig(String input) {
    
    BigDecimal big = new BigDecimal(input);
	
	return big;

}

public ArrayList createArray(int a, int b, int c) {
	
	ArrayList<Integer> list = new ArrayList();

	list.add(a);
	list.add(b);
	list.add(c);

	return list;

}

}