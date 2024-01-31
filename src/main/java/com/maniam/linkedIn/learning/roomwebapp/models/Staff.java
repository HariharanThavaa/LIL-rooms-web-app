package com.maniam.linkedIn.learning.roomwebapp.models;

public class Staff {
    private long id;
    private String empId;
    private String firstName;
    private String lastName;
    private String position;

    public Staff() {
    }

    public Staff(long id, String empId, String firstName, String lastName, String position) {
        this.id = id;
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
