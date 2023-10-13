package com.firstproject.vinaydemo.repository;

import com.firstproject.vinaydemo.dto.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryEmployee extends JpaRepository<Employee, Long> {

    Employee findByEmail(String email);
}
