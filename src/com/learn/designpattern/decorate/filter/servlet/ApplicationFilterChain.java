package com.learn.designpattern.decorate.filter.servlet;

/**
 *
 * 参考servlet filter模式在filterChain中保存所有的filter以及当前处理的filter所有
 * @author zhengxc
 * @date 2019/9/23
 */
public class ApplicationFilterChain implements FilterChain {

    Filter[] filters;

    private int position = 0;

    public ApplicationFilterChain(Filter[] filters) {
        this.filters = filters;
    }

    public Filter[] getFilters() {
        return filters;
    }

    public void setFilters(Filter[] filters) {
        this.filters = filters;
    }

    @Override
    public void doFilter(RequestDto requestDto, Response response) {
        if ((filters.length) != position) {
            Filter filter = filters[position++];
            filter.doFilter(requestDto, response, this);
        } else {
            //business resolve
            System.out.println("business success");
        }
    }
}
