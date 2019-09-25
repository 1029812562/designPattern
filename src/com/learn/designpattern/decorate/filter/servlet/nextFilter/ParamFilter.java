package com.learn.designpattern.decorate.filter.servlet.nextFilter;

/**
 * Created by zhengxc on 2019/9/23.
 */
public class ParamFilter extends Filter{

    @Override
    public void doFilter() {
        System.out.println("i am paramFilter start");
        Filter nextFilter = this.getNextFilter();
        if(nextFilter!=null){
            nextFilter.doFilter();
        }
        System.out.println("i am paramFilter end");
    }
}
