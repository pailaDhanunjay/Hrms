package com.employeeManagement.Repository;

import com.employeeManagement.Entity.Payroll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PayrollRepository extends JpaRepository<Payroll,Integer> {
}
