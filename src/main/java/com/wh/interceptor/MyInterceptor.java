package com.wh.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import java.util.Map;

/**
 * 自定义拦截器
 * Created by wang1 on 2017/9/15.
 */
public class MyInterceptor extends AbstractInterceptor{

    public String intercept(ActionInvocation actionInvocation) throws Exception {
        Map<String, Object> session = actionInvocation.getInvocationContext().getSession();
        System.out.println("interceptor has been running");
        String invoke = actionInvocation.invoke();
        return invoke;
    }
}
