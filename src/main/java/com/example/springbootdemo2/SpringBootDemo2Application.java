package com.example.springbootdemo2;

import com.example.springbootdemo2.spring.boot.MyServlet2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@ServletComponentScan(basePackages = {"com.example.springbootdemo2.servlet"})
public class SpringBootDemo2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemo2Application.class, args);
    }


    @Bean
    public static ServletRegistrationBean servletRegistrationBean() {

        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean();

        servletRegistrationBean.setServlet(new MyServlet2());

        servletRegistrationBean.addUrlMappings("/spring-boot/myservlet2");

        servletRegistrationBean.addInitParameter("myName", "myValue");

        return servletRegistrationBean;


    }

}

