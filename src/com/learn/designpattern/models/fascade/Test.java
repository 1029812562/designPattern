package com.learn.designpattern.models.fascade;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhengxc on 2019/9/25.
 */
public class Test {

    public static void main(String[] args) {
//        Plate<Fruit> plate = new Plate<Banana>(); //错误因为T已经标识了具体的类型

        Plate<? extends Fruit> fruitPlate = new Plate<Banana>(); //存放任意水果的盘子肯定可以存放banana 通配符表示任意的一种类型
//        fruitPlate.setDate(new Fruit()); //错误因为该盘子是存放任意水果的一种 可能是水果可能是香蕉 可能是苹果 所以不知道能存啥

        List<Number> numberList = new ArrayList<Number>();
        List<Integer> integerList = new ArrayList<Integer>();
        Plate.copy(integerList, numberList);
    }


}
