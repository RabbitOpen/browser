package org.file.browse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author xiaoqianbin
 * @date 2020/6/4
 **/
@SpringBootApplication
public class SpringBootEntry extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootEntry.class);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringBootEntry.class);
    }
}
