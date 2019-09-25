package com.learn.designpattern.decorate.filter.servlet;

/**
 * Created by zhengxc on 2019/9/23.
 */
public class Test {

    public static void main(String[] args) {
        RequestDto requestDto = new RequestDto();
        requestDto.setRequestData("ok");
        Response response = new Response();
        Filter[] filters = new Filter[2];
        filters[0] = new ParamFilter();
        filters[1] = new AuthFilter();
        ApplicationFilterChain applicationFilterChain = new ApplicationFilterChain(filters);
        applicationFilterChain.doFilter(requestDto, response);
        System.out.println(response);
    }

}
