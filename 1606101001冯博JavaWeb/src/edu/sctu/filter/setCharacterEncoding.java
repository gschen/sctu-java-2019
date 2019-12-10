package edu.sctu.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class setCharacterEncoding implements Filter {

    private String encode = null;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpSession session = ((HttpServletRequest) servletRequest).getSession();
        if (this.encode != null && !this.encode.equals("")) {
            servletRequest.setCharacterEncoding(this.encode);
        } else {
            servletRequest.setCharacterEncoding("Utf-8");
            filterChain.doFilter(servletRequest, servletResponse);
        }
    }



    @Override
    public void destroy() {

    }
}
