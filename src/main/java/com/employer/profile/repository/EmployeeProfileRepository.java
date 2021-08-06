package com.employer.profile.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employer.profile.entity.Employee;

@Repository
public interface EmployeeProfileRepository extends JpaRepository<Employee,Long>{

}
