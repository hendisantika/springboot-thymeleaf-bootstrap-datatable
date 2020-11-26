package com.hendisantika.springbootthymeleafbootstrapdatatable.service;

import com.hendisantika.springbootthymeleafbootstrapdatatable.model.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Comparator;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-thymeleaf-bootstrap-datatable
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 26/11/20
 * Time: 13.42
 */
@Slf4j
@Service
public class EmployeeService {

    private static final Comparator<Employee> EMPTY_COMPARATOR = (e1, e2) -> 0;

}
