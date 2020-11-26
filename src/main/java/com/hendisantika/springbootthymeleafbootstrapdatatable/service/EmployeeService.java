package com.hendisantika.springbootthymeleafbootstrapdatatable.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hendisantika.springbootthymeleafbootstrapdatatable.model.Employee;
import com.hendisantika.springbootthymeleafbootstrapdatatable.model.paging.Page;
import com.hendisantika.springbootthymeleafbootstrapdatatable.model.paging.PagingRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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

    public Page<Employee> getEmployees(PagingRequest pagingRequest) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            List<Employee> employees = objectMapper.readValue(getClass().getClassLoader()
                            .getResourceAsStream("employees.json"),
                    new TypeReference<List<Employee>>() {
                    });

            return getPage(employees, pagingRequest);

        } catch (IOException e) {
            log.error(e.getMessage(), e);
        }

        return new Page<>();
    }

    private Page<Employee> getPage(List<Employee> employees, PagingRequest pagingRequest) {
        List<Employee> filtered = employees.stream()
                .sorted(sortEmployees(pagingRequest))
                .filter(filterEmployees(pagingRequest))
                .skip(pagingRequest.getStart())
                .limit(pagingRequest.getLength())
                .collect(Collectors.toList());

        long count = employees.stream()
                .filter(filterEmployees(pagingRequest))
                .count();

        Page<Employee> page = new Page<>(filtered);
        page.setRecordsFiltered((int) count);
        page.setRecordsTotal((int) count);
        page.setDraw(pagingRequest.getDraw());

        return page;
    }

}
