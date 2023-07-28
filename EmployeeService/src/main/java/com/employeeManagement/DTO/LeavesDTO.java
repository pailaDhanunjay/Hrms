package com.employeeManagement.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LeavesDTO {
    private int id;
    private int numberOfLeaves;
    private int remainingLeaves;
    private Date startDate;
    private Date endDate;
    private String leaveType;
    private String status;
}
