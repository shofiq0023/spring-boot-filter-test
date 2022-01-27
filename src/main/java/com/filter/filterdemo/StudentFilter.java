package com.filter.filterdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Component
//@Order(1)
public class StudentFilter implements Filter {

    Logger logger = LoggerFactory.getLogger(StudentFilter.class);

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        logger.info("[StudentFilter] - Inside student filter class");
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        logger.info("Method :" + request.getMethod());
        logger.info("Request URI : " + request.getRequestURI());
        logger.info("Servlet name: " + request.getServletPath());

        filterChain.doFilter(servletRequest, servletResponse);
    }
}
