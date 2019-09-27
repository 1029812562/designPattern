package com.learn.designpattern.models.copy;

/**
 * Created by zhengxc on 2019/9/25.
 */
public class Test {

    public static void main(String[] args) {
        try {
            //浅拷贝
            Person person = new Person();

            Person personCopy = (Person) person.clone();
            Age age = new Age();
            age.setAge(13);
            person.setAge(age);
            age.setAge(14);
            System.out.println("souceAge:"+person);
            System.out.println("ageCopy:"+personCopy);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }

}
