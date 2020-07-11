package com.sample;

import com.sample.filter.CustomFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

/**
 * Simple class to start up the application.
 *
 * @SpringBootApplication
 * @Configuration
 * @EnableAutoConfiguration
 * @ComponentScan
 */
@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    /**
     * mainメソッド.
     *
     * @param args 引数
     */
    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    protected final SpringApplicationBuilder configure(
            final SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

    /**
     * CustomFilterを設定する.
     *
     * @return CustomFilterオブジェクト.
     */
    @Bean
    CustomFilter setCustomFilter() {
        return new CustomFilter();
    }
}
