package com.hendisantika.springbootthymeleafbootstrapdatatable.model.paging;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-thymeleaf-bootstrap-datatable
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 26/11/20
 * Time: 13.37
 */
@Data
@NoArgsConstructor
public class Search {
    private String value;
    private String regexp;
}
