package com.learn.designpattern.models.iterator;

/**
 *
 * @author zhengxc
 * @date 2019/9/20
 */
public interface Iterator<E> {

    boolean hasNext();

    E next();

    void remove();

}
