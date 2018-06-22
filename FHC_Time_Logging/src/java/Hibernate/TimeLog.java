/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hibernate;

import java.sql.Timestamp;


/**
 *
 * @author reddo
 */
public class TimeLog {
    
    private int timeLogId;
    private Timestamp timeLogTimeStamp;
    private int timeLogActionId;
    private int timeLogPatronId;

    public void setTimeLogId(int timeLogId) {
        this.timeLogId = timeLogId;
    }

    public void setTimeLogTimeStamp(Timestamp timeLogTimeStamp) {
        this.timeLogTimeStamp = timeLogTimeStamp;
    }

    public void setTimeLogActionId(int timeLogActionId) {
        this.timeLogActionId = timeLogActionId;
    }

    public void setTimeLogPatronId(int timeLogPatronId) {
        this.timeLogPatronId = timeLogPatronId;
    }

    public int getTimeLogId() {
        return timeLogId;
    }

    public Timestamp getTimeLogTimeStamp() {
        return timeLogTimeStamp;
    }

    public int getTimeLogActionId() {
        return timeLogActionId;
    }

    public int getTimeLogPatronId() {
        return timeLogPatronId;
    }
    
}
