package edu.sctu.filter;

import javax.servlet.*;
import java.io.IOException;

public class DemoFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //初始化

        System.out.println("初始化过滤器！");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        //执行过滤器操作
        System.out.println("执行过滤器操作");
        chain.doFilter(request,response);

    }

    @Override
    public void destroy() {
        //销毁过滤器
        System.out.println("销毁过滤器");

    }
}
