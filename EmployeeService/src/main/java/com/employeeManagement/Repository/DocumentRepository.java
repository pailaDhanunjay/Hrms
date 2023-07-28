package com.employeeManagement.Repository;

import com.employeeManagement.Entity.Documents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentRepository extends JpaRepository<Documents,Integer> {
}
