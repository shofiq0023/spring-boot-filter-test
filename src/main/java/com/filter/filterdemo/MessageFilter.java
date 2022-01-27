package com.filter.filterdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Component
//@Order(2)
public class MessageFilter implements Filter {

    Logger logger = LoggerFactory.getLogger(MessageFilter.class);

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        logger.info("[MessageFilter] - Inside message filter class");

        HttpServletRequest request = (HttpServletRequest) servletRequest;
        logger.info("Method name: " + request.getMethod());
        logger.info("Request URI: " + request.getRequestURI());
        logger.info("Servlet path: " + request.getServletPath());

        filterChain.doFilter(servletRequest, servletResponse);
    }
}
