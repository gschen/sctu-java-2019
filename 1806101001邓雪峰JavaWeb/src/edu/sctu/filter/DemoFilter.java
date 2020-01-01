package edu.sctu.filter;


import javax.servlet.*;
import java.io.IOException;

public class DemoFilter implements Filter
{


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.print("初始化过滤器");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.print("执行过滤器");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        System.out.print("销毁过滤器");
    }
}
