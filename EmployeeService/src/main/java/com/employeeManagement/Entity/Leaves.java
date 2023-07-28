package com.employeeManagement.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Leaves {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int numberOfLeaves;
    private int remainingLeaves;
    private Date startDate;
    private Date endDate;
    private String leaveType;
    private String status;
    //
    @ManyToOne(cascade = CascadeType.ALL)
    private Employee employee;

}
