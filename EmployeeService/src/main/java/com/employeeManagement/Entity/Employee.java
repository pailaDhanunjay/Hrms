package com.employeeManagement.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int employeeId;
    private String employeePosition;
    private Date dateOfJoining;
    //making relation with user entity
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_user_id",referencedColumnName = "id")
    private User user;
    //making relation with leave entity
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="fk_employee_id",referencedColumnName = "employeeId")
    private List<Leaves> leaves;
    //making relation with attendance entity
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="fk_employee_id",referencedColumnName = "employeeId")
    private List<Attendance> attendanceList;
    //making relation with payroll entity
   // @OneToOne(cascade = CascadeType.ALL)
    //private Payroll payroll;
    //making relation with performance entity
    @OneToOne(cascade = CascadeType.ALL)
    private Performance performance;
    //making relation with training entity
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="fk_employee_id",referencedColumnName = "employeeId")
    private List<Training> trainingList;
    //making relation with documents entity
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="fk_employee_id",referencedColumnName = "employeeId")
    private List<Documents> documentsList;

}
