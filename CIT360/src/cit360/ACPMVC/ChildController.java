/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.ACPMVC;

/**
 * @author Kirk Brown
 */
public class ChildController {
    
    // Identifying characteristics of ChildController class
    private Child model;
    private ChildView view;

    // Defining controller
    public ChildController(Child model, ChildView view){
        this.model = model;
        this.view = view;
    }

    // Getters and setters for Child model
    public void setChildName(String name){
        model.setName(name);		
    }

    public String getChildName(){
        return model.getName();		
    }

    public void setChildAge(int rollNo){
        model.setAge(rollNo);		
    }

    public int getChildAge(){
        return model.getAge();		
    }

    // Passing information to View for printing to screen
    public void updateView(){				
        view.printChildDetails(model.getName(), model.getAge());
    }	
}
