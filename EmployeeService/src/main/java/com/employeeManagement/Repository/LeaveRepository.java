package com.employeeManagement.Repository;

import com.employeeManagement.Entity.Leaves;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LeaveRepository extends JpaRepository<Leaves,Integer> {
    Optional<Object> findAllById(Integer employeeId);

    List<Leaves> findById(Long employeeId);
}
