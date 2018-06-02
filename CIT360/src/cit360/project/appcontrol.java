/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.project;

import java.util.HashMap;


/**
 *
 * @author Kirk Brown
 */

public class appcontrol {
    
    private HashMap<String,Handler> handlerMap = new HashMap();

    public void handleRequest(String command, String data){
        Handler aCommandHandler = handlerMap.get(command);
        if (aCommandHandler != null){
            aCommandHandler.handleIt(data);
        } else {
            OutputView.outputDetail("Oopsy");
        }
    }

    public void mapCommand(String aCommand, Handler acHandler){
        handlerMap.put(aCommand,acHandler);
    }
    
}
