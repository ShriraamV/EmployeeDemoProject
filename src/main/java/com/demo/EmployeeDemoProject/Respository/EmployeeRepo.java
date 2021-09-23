package com.demo.EmployeeDemoProject.Respository;

import com.demo.EmployeeDemoProject.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

}
