/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hibernate;

/**
 *
 * @author reddo
 */
public class Patron {
    
    private int patronId;
    private String patronFirstName;
    private String patronLastName;
    private boolean patronMember;

    public boolean isPatronMember() {
        return patronMember;
    }

    public void setPatronMember(boolean patronMember) {
        this.patronMember = patronMember;
    }

    public int getPatronId() {
        return patronId;
    }

    public void setPatronId(int patronId) {
        this.patronId = patronId;
    }

    public String getPatronFirstName() {
        return patronFirstName;
    }

    public void setPatronFirstName(String patronFirstName) {
        this.patronFirstName = patronFirstName;
    }

    public String getPatronLastName() {
        return patronLastName;
    }

    public void setPatronLastName(String patronLastName) {
        this.patronLastName = patronLastName;
    }
    
}
