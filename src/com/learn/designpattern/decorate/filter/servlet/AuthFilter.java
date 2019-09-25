package com.learn.designpattern.decorate.filter.servlet;

/**
 * Created by zhengxc on 2019/9/23.
 */
public class AuthFilter implements Filter{

    @Override
    public void doFilter(RequestDto requestDto, Response response, FilterChain filterChain) {
        System.out.println("权限校验开始");
        filterChain.doFilter(requestDto, response);
        System.out.println("权限校验结束");

    }
}
