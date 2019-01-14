package com.sima.licensingservice.utils;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by qisima on 1/10/2019 11:22 AM
 */
@Component
public class UserContextFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;

        UserContextHolder.getContext()
                .setCorrelationId(request.getHeader(UserContext.CORRELATION_ID));
        UserContextHolder.getContext()
                .setUserId(request.getHeader(UserContext.USER_ID));

        filterChain.doFilter(request, servletResponse);
    }
}
