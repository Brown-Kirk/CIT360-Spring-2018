/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.project;
import cit360.project.appcontrol;

public class JSON {
    private appcontrol appcontroller = new appcontrol();
    
    public void init(){
        appcontroller.mapCommand("JSONCommand", new Handler());
    }
    
    public static void main(String[] args) throws Exception {
        
        Controller.getJSON("https://launchlibrary.net/1.4/launch/next/1");

    }
}

