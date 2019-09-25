package com.learn.designpattern.decorate.copy;

/**
 * Created by zhengxc on 2019/9/25.
 */
public class Age implements Cloneable{

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Age{");
        sb.append("age=").append(age);
        sb.append('}');
        return sb.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
