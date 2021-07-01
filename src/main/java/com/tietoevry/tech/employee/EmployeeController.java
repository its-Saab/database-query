package com.tietoevry.tech.employee;

import com.tietoevry.tech.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class EmployeeController {
    EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeController(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;

    }

    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getAllEmployee(){
        return ResponseEntity.ok(employeeRepository.findAll());
    }

    @GetMapping("/employees/list")
    public ResponseEntity<List<Map<String,String>>> getQueriedEmployees(@RequestParam ArrayList<Integer> queryList) {

        List<Employee> queriedEmployeeList = employeeRepository.findAllById(queryList);
        ArrayList<Map<String,String>> employeesFilteredInfo = new ArrayList<>();

        if(queriedEmployeeList.size() == 0){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(employeesFilteredInfo);
        }

        employeesFilteredInfo =  Employee.filteredEmployeeInfo(queriedEmployeeList);
        return ResponseEntity.ok(employeesFilteredInfo);
    }

    @GetMapping("/employee/{employeeId}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Integer employeeId){
        Employee employee = employeeRepository.findById(employeeId).orElseThrow(ResourceNotFoundException::new);
        return ResponseEntity.ok(employee);
    }

}
