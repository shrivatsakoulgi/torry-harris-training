package com.torryharris.employeespringboot.controller;

import com.torryharris.employeespringboot.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class EmployeeController {
    static  ArrayList<Employee> empList;
    static{
        empList = new ArrayList<>();
        Employee e1= new Employee(1001,"Ram", "Manager",50000);
        Employee e2= new Employee(1002,"Shyam", "Lead",40000);
        Employee e3= new Employee(1003,"Sita", "HR",45000);
        Employee e4= new Employee(1004,"Radha", "Tech Lead",55000);
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
    }

    // Getting all employees
    @GetMapping("/employees")
    public ArrayList<Employee> getEmployee(){
        return empList;
    }
    // Get Employee by ID
    @GetMapping("/employees/{empId}")
    public Employee getEmployeeById(@PathVariable Integer empId){
        for(Employee e: empList){
            if(empId==e.getEmpId())
                return e;
        }
        return null;
    }

    //Add an Employee
    @PostMapping("/addemployee")
    public String addEmployee(@RequestBody Employee employee){
        empList.add(employee);
        return "Employee "+employee.getName()+" added successfully!!";
    }

    @DeleteMapping("/delete/{empId}")
    public String deleteEmployee(@PathVariable Integer empId){
        Employee temp=null;
        boolean found=false;
        for(Employee e:empList){
            if(empId==e.getEmpId()){
                temp=e;
                found=true;
                break;
            }
        }
        empList.remove(temp);
        if(found)
            return "Employee "+temp.getName()+" is deleted";
        else
            return "Employee with Id "+empId+" not Found";
    }

    @PutMapping("/update/{empId}")
    public String updateEmployee(@RequestBody Employee employee,@PathVariable Integer empId){
        deleteEmployee(empId);
        empList.add(employee);
        return "Success!!";
    }
}
