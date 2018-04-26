package com.example.xxf.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;


public class MyInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        Object name = request.getSession().getAttribute("name");
        String uri = request.getRequestURI();
        String url = "/login";
        if (uri.indexOf("admin/index")!=-1) {
                if (name == null) {
                    response.sendRedirect(url);
                    return false;
            }
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
       // System.out.println(">>>MyInterceptor1------>请求处理之后进行调用，Controller方法调用之后");
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        //System.out.println(">>>MyInterceptor1------>在整个请求结束之后被调用");
    }
}
