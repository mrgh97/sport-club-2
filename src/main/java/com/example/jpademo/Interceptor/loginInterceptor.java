package com.example.jpademo.Interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Component
public class loginInterceptor implements HandlerInterceptor {
    public final static String Session_Key="user";
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws IOException {
        HttpSession session=request.getSession();
        if(session.getAttribute(Session_Key)!=null){
            System.out.println(session.getAttribute(Session_Key));
            return true;
        }else{
            String url="/login";
            System.out.println("拦截");
            response.sendRedirect(url);
            return false;
        }
    }
}
