package com.demo.EmployeeDemoProject.Service;

import com.demo.EmployeeDemoProject.Entity.Employee;
import com.demo.EmployeeDemoProject.Respository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo repository;
    public Employee saveEmployee(Employee employee)
    {
        return repository.save(employee);
    }
    public List<Employee> saveEmployees(List<Employee> employees)
    {
        return repository.saveAll(employees);
    }
    public List<Employee> getEmployees()
    {
        return repository.findAll();
    }
    public Employee getEmployeeById(int id)
    {
        return repository.findById(id).orElse(null);
    }
    public String deleteEmployee(int id)
    {
        repository.deleteById(id);
        return "removed employee with id "+id;
    }
    public Employee updateEmployee(Employee employee)
    {
        //Removing set statements and code is working fine. SaveorUpdate is replaced by save in new version

        //Employee existingemployee = repository.findById(employee.getId()).orElse(null);
        //existingemployee.setId(employee.getId());
        //existingemployee.setName(employee.getName());
        //existingemployee.setRole(employee.getRole());
        return repository.save(employee);
    }



}
