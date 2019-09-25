package com.learn.designpattern.decorate;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by zhengxc on 2019/9/19.
 */
public class Test{

    public static void main(String[] args) {
        //椒盐味的苹果
        Apple apple = new Apple();
        System.out.println(new SaltPepper(apple).cost());
        System.out.println(new SaltPepper(apple).getDesc());

        try {
            FileInputStream fileInputStream = new FileInputStream("F:\\2.txt");
            UpCaseInputStream upCaseInputStream = new UpCaseInputStream(fileInputStream);
            int n = -1;
            while ((n = upCaseInputStream.read())!=-1){
                System.out.println((char)n);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
