package com.maniam.linkedIn.learning.roomwebapp.models;

public class StaffMember {
    private String empId;
    private String firstName;
    private String lastName;
    private Position position;

    public StaffMember() {
    }

    public StaffMember( String empId, String firstName, String lastName, Position position) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
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

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
