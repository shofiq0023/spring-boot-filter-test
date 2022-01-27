package com.filter.filterdemo;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfiguration {

    @Bean
    public FilterRegistrationBean<MessageFilter> messageRegistrationBean() {
        FilterRegistrationBean<MessageFilter> messageRegistrationBean = new FilterRegistrationBean<>();

        messageRegistrationBean.setFilter(new MessageFilter());
        messageRegistrationBean.addUrlPatterns("/message");

        return messageRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean<StudentFilter> studentRegistrationBean() {
        FilterRegistrationBean<StudentFilter> studentRegistrationBean = new FilterRegistrationBean<>();
        studentRegistrationBean.setFilter(new StudentFilter());
        studentRegistrationBean.addUrlPatterns("/student");

        return studentRegistrationBean;
    }
}
