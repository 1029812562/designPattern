package com.learn.designpattern.models.filter.servlet.nextFilter;

/**
 * Created by zhengxc on 2019/9/23.
 */
public class BusiFilter extends Filter{

    @Override
    public void doFilter() {
        System.out.println("i am busiFilter start");
        Filter nextFilter = this.getNextFilter();
        if(nextFilter!=null){
            nextFilter.doFilter();
        }
        System.out.println("i am busiFilter end");
    }
}
