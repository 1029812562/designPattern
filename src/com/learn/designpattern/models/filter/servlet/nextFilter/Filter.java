package com.learn.designpattern.models.filter.servlet.nextFilter;

/**
 *
 * @author zhengxc
 * @date 2019/9/23
 */
public abstract class Filter {

    private Filter nextFilter;

    public Filter getNextFilter() {
        return nextFilter;
    }

    public void setNextFilter(Filter nextFilter) {
        this.nextFilter = nextFilter;
    }

    public abstract void doFilter();

}
