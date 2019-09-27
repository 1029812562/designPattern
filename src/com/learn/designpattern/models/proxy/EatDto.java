package com.learn.designpattern.models.proxy;

import java.io.Serializable;

/**
 * Created by zhengxc on 2019/9/23.
 */
public class EatDto implements Serializable{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EatDto{");
        sb.append("name='").append(name).append('\'');
        sb.append(", parent: [").append(super.toString()).append(']');
        sb.append('}');
        return sb.toString();
    }
}
