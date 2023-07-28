package com.employeeManagement.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Performance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String rating;
    private String comments;
    private Date date;
    //making relation with employee entity
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_employee_id",referencedColumnName = "employeeId")
    private Employee employee;
}
