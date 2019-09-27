package com.learn.designpattern.models.filter.servlet;

/**
 * Created by zhengxc on 2019/9/23.
 */
public interface FilterChain {

    void doFilter(RequestDto requestDto, Response response);

}
