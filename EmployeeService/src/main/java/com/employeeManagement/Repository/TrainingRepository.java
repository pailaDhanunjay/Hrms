package com.employeeManagement.Repository;

import com.employeeManagement.Entity.Training;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingRepository extends JpaRepository<Training,Integer> {
}