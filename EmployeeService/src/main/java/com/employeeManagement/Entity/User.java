package com.employeeManagement.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String userName;
    private String userEmail;
    private String userPassword;
    private String userRole;
    private String department;
    //making relationship with employee entity
    @OneToOne(cascade = CascadeType.ALL)
    private Employee employee;

}
