package com.demo.EmployeeDemoProject.Controller;

import com.demo.EmployeeDemoProject.Entity.Employee;
import com.demo.EmployeeDemoProject.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app")
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee employee)
    {
        return service.saveEmployee(employee);
    }
    @PostMapping("/addEmployees")
    public List<Employee> addEmployees(@RequestBody List<Employee> employees)
    {
        return service.saveEmployees(employees);
    }
    @GetMapping("/getEmployeeById/{id}")
    public Employee findEmployee(@PathVariable int id)
    {
        return service.getEmployeeById(id);
    }
    @GetMapping("/employees")
    public List<Employee> findEmployees()
    {
        return service.getEmployees();
    }
    @PutMapping("/updateEmployee")
    public Employee updateEmployee(@RequestBody Employee employee)
    {
        return service.updateEmployee(employee);
    }
    @DeleteMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable int id)
    {
        return service.deleteEmployee(id);
    }



}
