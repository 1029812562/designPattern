package com.learn.designpattern.models.filter.servlet;

/**
 *
 * 在filter的实现中调用filterChain.doFilter从而将请求交由下一个filter处理
 * @author zhengxc
 * @date 2019/9/23
 */
public interface Filter {

    void doFilter(RequestDto requestDto, Response response, FilterChain filterChain);

}
