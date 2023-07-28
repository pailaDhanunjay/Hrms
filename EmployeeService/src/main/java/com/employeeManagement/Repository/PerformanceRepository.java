package com.employeeManagement.Repository;

import com.employeeManagement.Entity.Performance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerformanceRepository extends JpaRepository<Performance,Integer> {
}
