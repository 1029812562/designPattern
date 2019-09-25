package com.learn.designpattern.decorate.filter.servlet.nextFilter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhengxc on 2019/9/23.
 */
public class Test {

    public static void main(String[] args) {
        ParamFilter paramFilter = new ParamFilter();
        AuthFilter authFilter = new AuthFilter();
        paramFilter.setNextFilter(authFilter);
        BusiFilter busiFilter = new BusiFilter();
        authFilter.setNextFilter(busiFilter);
        paramFilter.doFilter();

    }

}
