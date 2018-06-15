/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hibernate;

import java.sql.Timestamp;
import java.util.Date;


/**
 *
 * @author reddo
 */
public class TimeLog {
    
    private int timeLogId;
    private Date timeLogTimeStamp;
    private int timeLogActionId;
    private int timeLogPatronId;

    public void setTimeLogId(int timeLogId) {
        this.timeLogId = timeLogId;
    }

    public void setTimeLogTimeStamp(Date timeLogTimeStamp) {
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

    public Date getTimeLogTimeStamp() {
        return timeLogTimeStamp;
    }

    public int getTimeLogActionId() {
        return timeLogActionId;
    }

    public int getTimeLogPatronId() {
        return timeLogPatronId;
    }
    
}
