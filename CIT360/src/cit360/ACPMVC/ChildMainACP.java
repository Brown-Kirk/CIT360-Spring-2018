/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.ACPMVC;

/**
 * @author Kirk Brown
 */
public class ChildMainACP {
    public static void main(String[] args) {

        // Call function to create initial Child
        Child model  = retrieveChild();

        // Create view to print Child info to screen
        ChildView view = new ChildView();
        ChildController controller = new ChildController(model, view);
        
        // Print Child info to screen
        controller.updateView();

        // Update Child with new values
        controller.setChildName("Rilie");
        controller.setChildAge(21);

        // Print new Child info to screen
        controller.updateView();
    }

    private static Child retrieveChild(){
        // Create initial child
        Child child = new Child();
        child.setName("Sarah");
        child.setAge(20);
        return child;
    }
}
