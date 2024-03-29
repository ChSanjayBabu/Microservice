package com.stackroute.Muzix.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.builders.RequestHandlerSelectors;
import static springfox.documentation.builders.PathSelectors.regex;


@EnableAutoConfiguration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.stackroute.Muzix.controller"))
                .paths(regex("/api/v1.*"))
                .build();
    }


}
//@Configuration
//@EnableSwagger2
//public class SwaggerConfig {
//    public static void main(String[] args) {
//        SpringApplication.run(SwaggerConfig.class, args);
//    }
//    @Bean
//    public Docket productApi() {
//        return new Docket(DocumentationType.SWAGGER_2).select()
//                .apis(RequestHandlerSelectors.basePackage("com.stackroute.MUzix.SwaggerConfig")).build();
//    }
//}