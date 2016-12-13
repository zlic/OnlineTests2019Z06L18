package com.acquisio.app.controller;

import com.acquisio.app.domain.Employee;
import com.acquisio.app.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @RequestMapping("/employees")
    public Map<Long, Employee> listEmployees() throws SQLException {
        return employeeRepository.findAll().stream()
                .collect(Collectors.toMap(Employee::getId, Function.identity()));
    }
}
