package com.learn.designpattern.models.fascade;

import java.util.List;

/**
 * Created by zhengxc on 2019/9/25.
 */
public class Plate<T> {

    T date;

    public T getDate() {
        return date;
    }

    public void setDate(T date) {
        this.date = date;
    }

    public static <T> void copy(List<? extends T> sourceList, List<? super T> destList){
        for (T t : sourceList){
            destList.add(t);
        }
    }

}
