package com.hendisantika.springbootthymeleafbootstrapdatatable.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-thymeleaf-bootstrap-datatable
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 26/11/20
 * Time: 13.46
 */
@Controller
@RequestMapping({"/", "/index"})
public class IndexController {

    @GetMapping
    public String main() {
        return "index";
    }
}
