package com.hendisantika.springbootthymeleafbootstrapdatatable.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-thymeleaf-bootstrap-datatable
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 26/11/20
 * Time: 13.34
 */
@Data
@NoArgsConstructor
public class Employee {

    @JsonFormat(pattern = "yyyy/MM/dd")
    @JsonProperty("start_date")
    private Date startDate;
    private Integer id;
    private String position;
    private String name;
    private Double salary;
    private String office;
    private Integer extn;
}
