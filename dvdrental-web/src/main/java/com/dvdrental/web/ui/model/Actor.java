package com.dvdrental.web.ui.model;

/**
 * Created by atul on 1/22/2018.
 */
public class Actor {
    private int actorId;
    private String firstName;
    private String lastName;

    public int getActorId() {
        return actorId;
    }

    public void setActorId(int actorId) {
        this.actorId = actorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
