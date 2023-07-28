package com.employeeManagement.Service;

import com.employeeManagement.DTO.EmployeeDTO;
import com.employeeManagement.DTO.LeavesDTO;
import com.employeeManagement.Entity.Employee;
import com.employeeManagement.Entity.Leaves;
import com.employeeManagement.Entity.User;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    public User saveUser(User user);
    public Optional<User> getOneUser(Integer id);
    public Leaves addLeave(Integer employeeId,Leaves leaves);
    public List<Leaves> getAllLeavesByEmployeeId(Integer employeeId);
    public EmployeeDTO getOneEmployee(Integer employeeId);
}
