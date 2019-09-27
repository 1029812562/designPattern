package com.learn.designpattern.models.filter.servlet;

/**
 * Created by zhengxc on 2019/9/23.
 */
public class ParamFilter implements Filter{

    @Override
    public void doFilter(RequestDto requestDto, Response response, FilterChain filterChain) {
        System.out.println("request param="+requestDto);
        if(requestDto.getRequestData().equals("ok")){
            System.out.println("参数校验开始");
            filterChain.doFilter(requestDto, response);
            System.out.println("参数校验结束");
        }else{
            System.out.println("参数校验失败");
            response.setRes(false);
            return;
        }
    }
}
