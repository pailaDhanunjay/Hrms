package com.employeeManagement.Service;

import com.employeeManagement.DTO.EmployeeDTO;
import com.employeeManagement.DTO.LeavesDTO;
import com.employeeManagement.Entity.Employee;
import com.employeeManagement.Entity.Leaves;
import com.employeeManagement.Entity.User;
import com.employeeManagement.Repository.EmployeeRepository;
import com.employeeManagement.Repository.LeaveRepository;
import com.employeeManagement.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private LeaveRepository leaveRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public Optional<User> getOneUser(Integer id) {
        return userRepository.findById(id);
    }

    @Override
    public Leaves addLeave(Integer employeeId, Leaves leaves){
        Employee employee = employeeRepository.findById(employeeId).get();
        // Associate the leave with the correct employee
        leaves.setEmployee(employee);

        return leaveRepository.save(leaves);
    }

   @Override
   public List<Leaves> getAllLeavesByEmployeeId(Integer employeeId) {
       List<Leaves> leaves= (List) leaveRepository.findById(employeeId).get();
       return leaves;
   }
    @Override
    public EmployeeDTO getOneEmployee(Integer employeeId) {
        Employee employee=employeeRepository.findById(employeeId).get();
        return new EmployeeDTO(employee.getEmployeeId(), employee.getEmployeePosition(),employee.getDateOfJoining());

    }
}
