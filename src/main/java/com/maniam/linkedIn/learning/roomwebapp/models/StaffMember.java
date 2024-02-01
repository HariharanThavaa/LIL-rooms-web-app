package com.maniam.linkedIn.learning.roomwebapp.models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "EMPLOYEE")
public class StaffMember {
    @Id
    @Column(name="EMPLOYEE_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String empId;
    @Column(name="FIRST_NAME")
    private String firstName;
    @Column(name="LAST_NAME")
    private String lastName;
    @Column(name="POSITION")
    @Enumerated(EnumType.STRING)
    private Position position;

    public StaffMember() {
        this.empId = UUID.randomUUID().toString();
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
