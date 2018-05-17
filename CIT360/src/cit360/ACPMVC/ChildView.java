/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.ACPMVC;

/**
 * @author Kirk Brown
 */
public class ChildView {
    // Defining view output
    public void printChildDetails(String childName, int childAge){
        System.out.println("Child: ");
        System.out.println("Name: " + childName);
        System.out.println("Age: " + childAge);
    }
}