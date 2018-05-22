/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.project;

import com.google.gson.Gson;

/**
 *
 * @author reddo
 */
public class OutputView {
    
    public static void outputDetail ( String message, String detail ) {

        System.out.println(message + " " + detail);

    }
    public static void outputDetail ( String message ) {

        System.out.println(message);

    }
    public static void outputBlankLine() {

        System.out.println();

    }
}
