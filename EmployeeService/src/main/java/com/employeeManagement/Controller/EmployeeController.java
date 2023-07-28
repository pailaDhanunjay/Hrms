package com.employeeManagement.Controller;

import com.employeeManagement.DTO.EmployeeDTO;
import com.employeeManagement.DTO.LeavesDTO;
import com.employeeManagement.Entity.Leaves;
import com.employeeManagement.Entity.User;
import com.employeeManagement.Service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class EmployeeController {
    @Autowired
    private EmployeeServiceImpl userService;
    @PostMapping("/register")
    public String saveUser(@RequestBody User user){
        User user1=userService.saveUser(user);
        if(user1!=null) {return "New User Registration was Successful!!!";}
        else {return "Unsuccessful Registration!!!";}
    }
    @GetMapping("/getOneUser/{id}")
    public Optional<User> getUser(@PathVariable Integer id){
        return userService.getOneUser(id);
    }
    @PostMapping("addLeaveBy/{employeeId}")
    public Leaves addLeave(@PathVariable Integer employeeId, @RequestBody Leaves leaves) {
        Leaves createdLeave = userService.addLeave(employeeId, leaves);
        return createdLeave;
    }
    @GetMapping("/getLeaves/{employeeId}")
    public ResponseEntity<List<Leaves>> getLeavesByEmployeeId(@PathVariable Integer employeeId) {
        List<Leaves> leaves = userService.getAllLeavesByEmployeeId(employeeId);
        return new ResponseEntity<>(leaves, HttpStatus.OK);
    }

    @GetMapping("/getOneEmployee/{employeeId}")
    public EmployeeDTO getEmployee(@PathVariable("employeeId") Integer employeeId) {
        EmployeeDTO employee = userService.getOneEmployee(employeeId);
        return employee;
    }
}
