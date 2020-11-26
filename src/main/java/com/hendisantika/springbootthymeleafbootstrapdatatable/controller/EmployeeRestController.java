package com.hendisantika.springbootthymeleafbootstrapdatatable.controller;

import com.hendisantika.springbootthymeleafbootstrapdatatable.model.Employee;
import com.hendisantika.springbootthymeleafbootstrapdatatable.model.paging.Page;
import com.hendisantika.springbootthymeleafbootstrapdatatable.model.paging.PagingRequest;
import com.hendisantika.springbootthymeleafbootstrapdatatable.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-thymeleaf-bootstrap-datatable
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 26/11/20
 * Time: 13.47
 */
@RestController
@RequestMapping("employees")
public class EmployeeRestController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public Page<Employee> list(@RequestBody PagingRequest pagingRequest) {
        return employeeService.getEmployees(pagingRequest);
    }
}
