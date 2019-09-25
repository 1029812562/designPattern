package com.learn.designpattern.decorate.iterator;

/**
 * Created by zhengxc on 2019/9/20.
 */
public class MenuItem {

    private String name;

    private double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MenuItem{");
        sb.append("name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append(", parent: [").append(super.toString()).append(']');
        sb.append('}');
        return sb.toString();
    }
}
