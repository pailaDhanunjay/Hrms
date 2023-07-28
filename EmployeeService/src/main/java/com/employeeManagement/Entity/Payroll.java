package com.employeeManagement.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payroll {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String payrollPeriod;
    private Double salary;
    private Double deductions;
    private Double netSalary;
    //making relation with employee entity
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="fk_employee_id",referencedColumnName = "employeeId")
    private Employee employee;
}
