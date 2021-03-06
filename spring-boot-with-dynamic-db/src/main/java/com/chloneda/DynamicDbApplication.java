package com.chloneda;

import com.chloneda.dynamicdbsource.DynamicDataSourceRegister;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@ImportAutoConfiguration
@Import({DynamicDataSourceRegister.class})
public class DynamicDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(DynamicDbApplication.class, args);
    }

}
